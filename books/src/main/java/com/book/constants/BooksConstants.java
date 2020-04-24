package com.book.constants;

public enum BooksConstants {

	 
	Mobiles("MOB"),
	TABLETS("TAB"),
	Product_Delete_Success("product.delete.success")
	;
	

	private final String type;

	private BooksConstants(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.type;
	}
}
