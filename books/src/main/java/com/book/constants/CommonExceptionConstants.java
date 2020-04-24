package com.book.constants;

public enum CommonExceptionConstants {

	 
	INPUT_PARAM_MISSING("input.parameter.missing"),
	NO_RESOURCE_FOUND("no.resource.found"),
	GENERAL_ERROR("general.error");
	
	private final String type;

	private CommonExceptionConstants(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.type;
	}
}
