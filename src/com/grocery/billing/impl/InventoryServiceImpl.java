package com.grocery.billing.impl;

import java.util.HashMap;

import com.grocery.billing.model.InventoryDetails;
import com.grocery.billing.model.Tax;
import com.grocery.billing.service.InventoryService;

public class InventoryServiceImpl implements InventoryService {

	HashMap<String, InventoryDetails> inventoryHub = new HashMap<>();
	HashMap<String, Tax> taxHub = new HashMap<>();

	public InventoryServiceImpl() {
	}

	@Override
	public void loadInventoryDetails(InventoryDetails inventoryItem) {
		inventoryHub.put(inventoryItem.getItemCode(), inventoryItem);
	}

	@Override
	public void loadTaxDetails(Tax taxItem) {
		taxHub.put(taxItem.getItemType(), taxItem);
	}

	@Override
	public InventoryDetails getItem(String itemCode) {
		InventoryDetails itemDetail = null;
		if (inventoryHub.containsKey(itemCode)) {
			itemDetail = inventoryHub.get(itemCode);
		}
		return itemDetail;
	}

	@Override
	public Tax getTax(String itemType) {
		Tax itemTax = null;
		if (taxHub.containsKey(itemType)) {
			itemTax = taxHub.get(itemType);
		}
		return itemTax;
	}
}
