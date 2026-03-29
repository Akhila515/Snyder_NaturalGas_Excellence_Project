package com.example.demo.exception;

public class DataNotFoundException extends RuntimeException {

	private final String messageKey;
	private final Object[] args;

	public DataNotFoundException(String messageKey, Object... args) {
		this.messageKey = messageKey;
		this.args = args;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public Object[] getArgs() {
		return args;
	}
}
