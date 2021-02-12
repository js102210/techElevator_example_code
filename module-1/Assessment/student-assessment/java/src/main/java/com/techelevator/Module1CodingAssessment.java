package com.techelevator;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowerShopOrder order = new FlowerShopOrder("standard", 3);


		System.out.println("Bouquet type: " + order.getBouquetType() + " Number of roses: " +order.getNumberOfRoses()
				+ " Cost of roses: " + order.getCostOfRoses() + " Subtotal: " + order.getSubtotal());


	}

}
