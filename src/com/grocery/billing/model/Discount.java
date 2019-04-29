package com.grocery.billing.model;

public class Discount {

	private float billAmount;
	private float discount;
	
	public Discount() {
		
	}
	
	public Discount(float billAmount, float discount) {
		super();
		this.billAmount = billAmount;
		this.discount = discount;
	}

	/**
	 * @return the billAmount
	 */
	public float getBillAmount() {
		return billAmount;
	}

	/**
	 * @param billAmount the billAmount to set
	 */
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}

	/**
	 * @return the discount
	 */
	public float getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(float discount) {
		this.discount = discount;
	}

}
