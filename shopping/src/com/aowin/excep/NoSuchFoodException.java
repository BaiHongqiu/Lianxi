package com.aowin.excep;

public class NoSuchFoodException extends Exception {

	public NoSuchFoodException() {
		super("没有该商品");   
	}

	public NoSuchFoodException(String message) {
		super(message);
	}

	
	
}
