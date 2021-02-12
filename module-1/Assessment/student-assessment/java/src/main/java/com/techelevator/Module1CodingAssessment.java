package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FlowerShopOrder order = new FlowerShopOrder("standard", 3);


		System.out.println("Bouquet type: " + order.getBouquetType() + " Number of roses: " +order.getNumberOfRoses()
				+ " Cost of roses: " + order.getCostOfRoses() + " Subtotal: " + order.getSubtotal());

		System.out.println(order.toString());
*/
		DailyOrderer dailyOrderer = new DailyOrderer();
		ArrayList<FlowerShopOrder> orderList = dailyOrderer.getOrders("data-files/FlowerInput.csv");

		for (FlowerShopOrder order: orderList){
			System.out.println(order);
		}

		BigDecimal todayTotal = BigDecimal.ZERO;
		for (FlowerShopOrder order : orderList) {
			todayTotal = todayTotal.add(order.getSubtotal());
		}
		System.out.println(todayTotal);


	}

}
