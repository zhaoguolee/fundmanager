package com.puyitou.fundmanager.auth.system.exception;

public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = -5614716664135041600L;

	public ApplicationException() {
		super();
	}
	
	public ApplicationException(String message) {
		super(message);
	}
	
    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ApplicationException(Throwable cause) {
        super(cause);
    }
    
}
