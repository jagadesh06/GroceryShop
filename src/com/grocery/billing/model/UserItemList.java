package com.grocery.billing.model;

public class UserItemList {

	private String itemCode;
	private Double quantity;

	public UserItemList(String itemCode, Double quantity) {
		super();
		this.itemCode = itemCode;
		this.quantity = quantity;
	}

	/**
	 * @return the itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @return the quantity
	 */
	public Double getQuantity() {
		return quantity;
	}

	public UserItemList() {
		// TODO Auto-generated constructor stub
	}

}
