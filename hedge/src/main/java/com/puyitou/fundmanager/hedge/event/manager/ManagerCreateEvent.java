package com.puyitou.fundmanager.hedge.event.manager;

import com.puyitou.fundmanager.hedge.model.manager.Manager;
import com.puyitou.fundmanager.hedge.system.event.Event;

public class ManagerCreateEvent implements Event {

	private Manager manager;
	
	public ManagerCreateEvent(Manager manager) {
		this.setManager(manager);
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

}
