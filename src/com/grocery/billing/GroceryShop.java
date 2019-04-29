package com.grocery.billing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.grocery.billing.impl.BillingServiceImpl;
import com.grocery.billing.impl.InventoryServiceImpl;
import com.grocery.billing.model.InventoryDetails;
import com.grocery.billing.model.Tax;
import com.grocery.billing.model.UserItemList;
import com.grocery.billing.service.BillingService;
import com.grocery.billing.service.InventoryService;

/**
 * 
 */

/**
 * @author JAGADESH
 *
 */
public class GroceryShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InventoryService service = new InventoryServiceImpl();
			BillingService billing = new BillingServiceImpl();
			service.loadInventoryDetails(new InventoryDetails("00001", "Coconut Oil", "Eatable", 200.00));
			service.loadInventoryDetails(new InventoryDetails("00002", "Rice", "Eatable", 60.00));
			service.loadInventoryDetails(new InventoryDetails("00004", "Dhal", "Eatable", 120.50));
			service.loadInventoryDetails(new InventoryDetails("00005", "Tooth Paste", "Daily Usable", 45.25));
			service.loadInventoryDetails(new InventoryDetails("00006", "Makeup Kit", "Cosmetic", 300.00));

			service.loadTaxDetails(new Tax("Eatable", 5));
			service.loadTaxDetails(new Tax("Daily Usable", 8));
			service.loadTaxDetails(new Tax("Cosmetic", 15));

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer itemNumber = Integer.parseInt(br.readLine());
			ArrayList<UserItemList> userItemList = new ArrayList<>();
			for (int i = 0; i < itemNumber; i++) {
				String itemCode = br.readLine();
				Double quantity = Double.parseDouble(br.readLine());
				
				userItemList.add(new UserItemList(itemCode, quantity));
				
				InventoryDetails itemDetails = service.getItem(itemCode);
				Tax taxDetails = service.getTax(itemDetails.getType());

				float billAmount = billing.calculatePrice(itemDetails, quantity);
				float taxAmount = billing.calculateTax(taxDetails, itemDetails, quantity);

				System.out.println(itemDetails.getItemCode() + "     " + itemDetails.getItemName() + "     " + quantity
						+ "     " + itemDetails.getUnitPrice() + "     " + taxAmount + "     "
						+ (billAmount + taxAmount));
				billing.calculateTotal((billAmount + taxAmount));

			}
			System.out.println("Total Discount " + billing.getTotal());
			System.out.println("Discount " + billing.calculateDiscount());
			System.out.println("Total " + (billing.calculateDiscount() - billing.getTotal()));
		} catch (Exception e) {
			System.out.println("Error" + e);
		}

	}

}
