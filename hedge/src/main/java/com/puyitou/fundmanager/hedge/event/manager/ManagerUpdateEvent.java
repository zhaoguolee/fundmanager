package com.puyitou.fundmanager.hedge.event.manager;

import com.puyitou.fundmanager.hedge.model.manager.Manager;
import com.puyitou.fundmanager.hedge.system.event.Event;

public class ManagerUpdateEvent implements Event {

	private Manager manager;
	
	private Manager updateManager;
	
	public ManagerUpdateEvent(Manager manager, Manager updateManager) {
		this.setManager(manager);
		this.setUpdateManager(updateManager);
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Manager getUpdateManager() {
		return updateManager;
	}

	public void setUpdateManager(Manager updateManager) {
		this.updateManager = updateManager;
	}

}
