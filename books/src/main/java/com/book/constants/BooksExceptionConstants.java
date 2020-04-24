package com.book.constants;

public enum BooksExceptionConstants {

	
	Product_Not_Found("product.not.found");
	   

	private final String type;

	private BooksExceptionConstants(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.type;
	}
}
