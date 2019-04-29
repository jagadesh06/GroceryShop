package com.grocery.billing.service;

import com.grocery.billing.model.InventoryDetails;
import com.grocery.billing.model.Tax;

public interface BillingService {
	float calculatePrice(InventoryDetails itemDetails, Double quantity);

	float calculateTax(Tax tax, InventoryDetails itemDetails, Double quantity);
	
	void calculateTotal(float amount);
	
	float getTotal();
	
	float calculateDiscount();
}
