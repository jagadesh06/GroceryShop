package com.grocery.billing.impl;

import com.grocery.billing.model.InventoryDetails;
import com.grocery.billing.model.Tax;
import com.grocery.billing.service.BillingService;

public class BillingServiceImpl implements BillingService {

	float totalBillAmount = 0;

	public BillingServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculatePrice(InventoryDetails itemDetails, Double quantity) {
		return (float) (itemDetails.getUnitPrice() * quantity);
	}

	@Override
	public float calculateTax(Tax tax, InventoryDetails itemDetails, Double quantity) {
		return (calculatePrice(itemDetails, quantity) * tax.getGstTax()) / 100;
	}

	@Override
	public void calculateTotal(float amount) {
		totalBillAmount = totalBillAmount + amount;
	}
	
	@Override
	public float calculateDiscount() {
		if (totalBillAmount < 2000) {
			return totalBillAmount * 2 / 100;
		} else {
			return totalBillAmount * 5 / 100;
		}
	}

	@Override
	public float getTotal() {
		return totalBillAmount;
	}

}
