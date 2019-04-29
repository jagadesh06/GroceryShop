package com.grocery.billing.model;

public class Tax {

	private String itemType;
	private float gstTax;
	
	public Tax() {
		
	}
	
	public Tax(String itemType, float gstTax) {
		super();
		this.itemType = itemType;
		this.gstTax = gstTax;
	}


	/**
	 * @return the itemType
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * @return the gstTax
	 */
	public float getGstTax() {
		return gstTax;
	}
	
}
