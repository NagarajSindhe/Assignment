package com.java2novice.restful;

public class CutomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	CutomException(String msg){
		super(msg);
	}

}
