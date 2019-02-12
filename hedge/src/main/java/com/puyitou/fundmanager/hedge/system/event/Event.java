package com.puyitou.fundmanager.hedge.system.event;

public interface Event {

	default Class<? extends Event> getType() {
		return getClass();
	};
	
}
