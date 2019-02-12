package com.puyitou.fundmanager.hedge.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.BeanUtils;

import com.puyitou.fundmanager.hedge.model.manager.Manager;

public class ManagerDTO {

	@NotBlank(message = "管理人名称不能为空") 
    private String name;

    private String registrationNumber;

    private String socialCreditCode;

    private Date registrationTime;

    private String legalRepresent;

    private Date establishTime;

    private Integer registeredCapital;

    private String registeredAddress;

    private String officeAddress;

    public Manager convert(Manager manager) {
    	// TODO
    	Manager updateManager = new Manager();
    	if (null != manager) {
    		BeanUtils.copyProperties(manager, updateManager);
    	}
    	updateManager.setName(name);
    	updateManager.setRegistrationNumber(registrationNumber);
    	return updateManager;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getSocialCreditCode() {
		return socialCreditCode;
	}

	public void setSocialCreditCode(String socialCreditCode) {
		this.socialCreditCode = socialCreditCode;
	}

	public Date getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(Date registrationTime) {
		this.registrationTime = registrationTime;
	}

	public String getLegalRepresent() {
		return legalRepresent;
	}

	public void setLegalRepresent(String legalRepresent) {
		this.legalRepresent = legalRepresent;
	}

	public Date getEstablishTime() {
		return establishTime;
	}

	public void setEstablishTime(Date establishTime) {
		this.establishTime = establishTime;
	}

	public Integer getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(Integer registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public String getRegisteredAddress() {
		return registeredAddress;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
    
}
