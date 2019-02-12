package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.payment.RefundAudit;
import com.puyitou.fundmanager.hedge.model.payment.RefundAuditExample;

public interface RefundAuditMapper {
    long countByExample(RefundAuditExample example);

    int deleteByExample(RefundAuditExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RefundAudit record);

    int insertSelective(RefundAudit record);

    List<RefundAudit> selectByExample(RefundAuditExample example);

    RefundAudit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RefundAudit record, @Param("example") RefundAuditExample example);

    int updateByExample(@Param("record") RefundAudit record, @Param("example") RefundAuditExample example);

    int updateByPrimaryKeySelective(RefundAudit record);

    int updateByPrimaryKey(RefundAudit record);
}