package com.grocery.billing.model;

public class InventoryDetails {

	/**
	 * 
	 */
	private String itemCode;
	private String itemName;
	private String type;
	private double unitPrice;
	
	public InventoryDetails(String itemCode, String itemName, String type, double unitPrice) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.type = type;
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	public InventoryDetails() {

	}

}
