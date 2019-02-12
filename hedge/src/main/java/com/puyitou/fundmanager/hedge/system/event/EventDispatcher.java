package com.puyitou.fundmanager.hedge.system.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EventDispatcher {

	private HashMap<Class<? extends Event>, List<EventHandler<? extends Event>>> allHandlers = new HashMap<>();
	
	public synchronized <E extends Event> void registerHandler(Class<E> eventType, EventHandler<E> handler) {
		List<EventHandler<? extends Event>> handlers = allHandlers.get(eventType);
		if (null == handlers) {
			handlers = new ArrayList<>();
			allHandlers.put(eventType, handlers);
		}
		handlers.add(handler);
		handlers.sort((o1, o2) -> {
			return o1.getOrder() - o2.getOrder();
		});
	}

	@SuppressWarnings("unchecked")
	public <E extends Event> void dispatch(E event) {
		List<EventHandler<? extends Event>> handlers = allHandlers.get(event.getType());
		if (null != handlers) {
			handlers.stream().forEach(handler -> {
				EventHandler<E> eventHandler = (EventHandler<E>)handler;
				eventHandler.onEvent(event);
			});
		}
	}

}
