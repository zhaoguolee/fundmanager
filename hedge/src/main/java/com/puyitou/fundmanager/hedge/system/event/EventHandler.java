package com.puyitou.fundmanager.hedge.system.event;

public interface EventHandler<E extends Event> {

	default int getOrder() {
		return 0;
	}
	
	void onEvent(E event);
	
}
