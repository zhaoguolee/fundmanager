package com.puyitou.fundmanager.hedge.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.puyitou.fundmanager.hedge.dto.ManagerDTO;
import com.puyitou.fundmanager.hedge.dto.ManagerQueryDTO;
import com.puyitou.fundmanager.hedge.dto.PageRequest;
import com.puyitou.fundmanager.hedge.model.manager.Manager;
import com.puyitou.fundmanager.hedge.service.manager.ManagerService;
import com.puyitou.fundmanager.hedge.system.exception.ApplicationException;
import com.puyitou.fundmanager.hedge.system.response.RestResponseBody;

@RestController
@RequestMapping(path = "/manager")
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@PreAuthorize(value = "hasAuthority('managerCreate')")
	public RestResponseBody<?> create(@Valid ManagerDTO record) {
		managerService.insert(record);
		return new RestResponseBody<>(RestResponseBody.SUCCESS);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public RestResponseBody<?> delete(@PathVariable String id) {
		managerService.delete(id);
		return new RestResponseBody<>(RestResponseBody.SUCCESS);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public RestResponseBody<?> update(@PathVariable String id, @Valid ManagerDTO record) {
		managerService.updateById(id, record);
		return new RestResponseBody<>(RestResponseBody.SUCCESS);
	}

	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
	public RestResponseBody<?> findById(@PathVariable String id) {
		Manager manager = managerService.findById(id);
		if (null == manager) {
			throw new ApplicationException("管理人不存在");
		}
		return new RestResponseBody<>(RestResponseBody.SUCCESS, manager);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public RestResponseBody<?> list(ManagerQueryDTO managerQueryDTO) {
		List<Manager> managers = managerService.list(managerQueryDTO);
		return new RestResponseBody<>(RestResponseBody.SUCCESS, managers);
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public RestResponseBody<?> page(ManagerQueryDTO managerQueryDTO, PageRequest pageRequest) {
		PageInfo<Manager> managers = managerService.page(managerQueryDTO, pageRequest);
		return new RestResponseBody<>(RestResponseBody.SUCCESS, managers);
	}

	@RequestMapping(value = "/somethingWrong", method = RequestMethod.GET)
	public RestResponseBody<?> somethingWrong() {
		throw new ApplicationException("抛出异常");
	}

}
