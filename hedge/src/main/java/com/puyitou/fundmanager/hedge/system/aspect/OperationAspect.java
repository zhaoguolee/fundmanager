package com.puyitou.fundmanager.hedge.system.aspect;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.puyitou.fundmanager.hedge.mapper.SystemLogMapper;
import com.puyitou.fundmanager.hedge.model.SystemLog;
import com.puyitou.fundmanager.hedge.model.User;
import com.puyitou.fundmanager.hedge.system.security.SecurityUserService;

@Aspect
@Component
public class OperationAspect {
	
	@Autowired
	private SystemLogMapper systemLogMapper;
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private SecurityUserService securityUserService;
	
    @After("within(com.puyitou..*) && @annotation(operationLog)")
    public void afterReturning(JoinPoint joinPoint, OperationLog operationLog) {
    	SystemLog systemLog = genSystemLog(joinPoint, operationLog);
        systemLog.setResult(SystemLog.RESULT_SUCCESS);
        systemLogMapper.insertSelective(systemLog);
    }

    @AfterThrowing("within(com.puyitou..*) && @annotation(operationLog)")
    public void afterThrowing(JoinPoint joinPoint, OperationLog operationLog) {
    	SystemLog systemLog = genSystemLog(joinPoint, operationLog);
        systemLog.setResult(SystemLog.RESULT_ERROR);
        systemLogMapper.insertSelective(systemLog);
    }
    
    private SystemLog genSystemLog(JoinPoint joinPoint, OperationLog operationLog) {
    	long now = System.currentTimeMillis();
    	String className = joinPoint.getTarget().getClass().getName();
    	String methodName = joinPoint.getSignature().getName();
    	Object[] args = joinPoint.getArgs();
    	ObjectMapper mapper = new ObjectMapper();
        SystemLog systemLog = new SystemLog();
        systemLog.setId(UUID.randomUUID().toString());
        systemLog.setCreateTime(now);
        systemLog.setDescription(operationLog.description());
        systemLog.setInvokeMethod(className + "." + methodName);
        if (null != request) {
        	systemLog.setIpAddress(request.getRemoteAddr());
        }
        if (null != securityUserService) {
        	User user = securityUserService.currentUser();
        	if (null != user) {
        		systemLog.setLoginName(user.getLoginName());
        		systemLog.setUserName(user.getUserName());
        	}
        }
        try {
			systemLog.setInvokeParams(mapper.writeValueAsString(args));
		} catch (JsonProcessingException e) {
			systemLog.setInvokeParams("writeValueAsString failed");
		}
        return systemLog;
    }
    
}
