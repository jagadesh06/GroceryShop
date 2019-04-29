package com.grocery.billing.service;

import com.grocery.billing.model.InventoryDetails;
import com.grocery.billing.model.Tax;

public interface InventoryService {
	void loadInventoryDetails(InventoryDetails inventoryItem);
	void loadTaxDetails(Tax taxItem);
	InventoryDetails getItem(String itemCode);
	Tax getTax(String itemType);
}
