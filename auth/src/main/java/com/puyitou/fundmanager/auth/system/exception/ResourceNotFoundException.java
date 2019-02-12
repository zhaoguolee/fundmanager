package com.puyitou.fundmanager.auth.system.exception;

public class ResourceNotFoundException extends ApplicationException {

	private static final long serialVersionUID = -5614716664135041600L;

	public ResourceNotFoundException() {
		super();
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }
    
}
