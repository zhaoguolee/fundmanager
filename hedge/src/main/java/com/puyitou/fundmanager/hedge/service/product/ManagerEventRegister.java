package com.puyitou.fundmanager.hedge.service.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.puyitou.fundmanager.hedge.event.manager.ManagerCreateEvent;
import com.puyitou.fundmanager.hedge.event.manager.ManagerDeleteEvent;
import com.puyitou.fundmanager.hedge.event.manager.ManagerUpdateEvent;
import com.puyitou.fundmanager.hedge.system.event.EventDispatcher;
import com.puyitou.fundmanager.hedge.system.event.EventHandler;

@Component
public class ManagerEventRegister {

	@Autowired
	private ProductService productService;
	
	private EventDispatcher eventDispatcher;
	
	@Autowired
	public ManagerEventRegister(EventDispatcher eventDispatcher) {
		this.eventDispatcher = eventDispatcher;
		registerManagerEvent();
	}
	
	private void registerManagerEvent() {
		
		eventDispatcher.registerHandler(ManagerCreateEvent.class, new EventHandler<ManagerCreateEvent>() {
			@Override
			public void onEvent(ManagerCreateEvent event) {
				// TODO
				System.out.println("manager create");
			}
		});
		
		eventDispatcher.registerHandler(ManagerUpdateEvent.class, new EventHandler<ManagerUpdateEvent>() {
			@Override
			public void onEvent(ManagerUpdateEvent event) {
				// TODO
				System.out.println("manager update");
			}
		});
		
		eventDispatcher.registerHandler(ManagerDeleteEvent.class, new EventHandler<ManagerDeleteEvent>() {
			@Override
			public void onEvent(ManagerDeleteEvent event) {
				// TODO
				System.out.println("manager delete");
			}
		});
		
	}
	
}
