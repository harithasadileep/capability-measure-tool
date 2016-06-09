package com.capability.util;

public enum ExceptionCodeEnum {
	WS_RECORD_NOT_FOUND_FOR_KEY("WS_RECORD_NOT_FOUND_FOR_KEY");

	private String value;

	/**
	 * Instantiates a new exception code enum.
	 *
	 * @param value
	 *            the value
	 */
	ExceptionCodeEnum(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}