package Others.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import Others.java.objetos.Purchase;
import Others.java.objetos.PurchaseItem;

public class TestePurchase {
	public static void main(String[] args) {
		
		List<Purchase> listOfPurchases = new LinkedList<>();
		Long purchaseId = Long.valueOf(listOfPurchases.size()+1);
		var purchase = new Purchase(purchaseId, "Notebook Gamer Alienware", 
				new BigDecimal("5000.00"), LocalDate.now(), 5, BigDecimal.ZERO);
		listOfPurchases.add(purchase);
		
		List<PurchaseItem> listOfPurchaseItems = new LinkedList<>();
		
		int countInstallmetns =  0;
		
		while(countInstallmetns != purchase.getTotalInstallments()) {
			
			BigDecimal valueInstallments = purchase.getTotalInstallments() == 1 ? new BigDecimal(purchase.getTotalValue().toString()) 
					: purchase.getTotalValue().divide(BigDecimal.valueOf(purchase.getTotalInstallments()));
			LocalDate paymentDate = null;
			
			var purchaseItemId = Long.valueOf(listOfPurchaseItems.size()+1);
			var purchaseItem = new PurchaseItem(purchaseItemId, purchase.getPurchaseId(), valueInstallments,
					LocalDate.now(), paymentDate, BigDecimal.ZERO);
			listOfPurchaseItems.add(purchaseItem);
			
			countInstallmetns++;
		}
		
		System.out.println(listOfPurchaseItems);
		
		
		
		
		
	}

}
