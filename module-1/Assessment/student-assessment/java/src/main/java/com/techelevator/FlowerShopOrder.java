package com.techelevator;

import java.math.BigDecimal;

public class FlowerShopOrder {
    private String bouquetType;
    private int numberOfRoses;
    private BigDecimal costOfRoses;
    private BigDecimal subtotal;
    private boolean sameDay;
    private String zipCode;


    public void setBouquetType(String bouquetType) {
        this.bouquetType = bouquetType;
    }

    public void setNumberOfRoses(int numberOfRoses) {
        this.numberOfRoses = numberOfRoses;
    }

    public String getBouquetType() {
        return this.bouquetType;
    }

    public int getNumberOfRoses() {
        return this.numberOfRoses;
    }

    public BigDecimal getCostOfRoses() {
        return this.costOfRoses;
    }

    public BigDecimal getSubtotal() {
        return this.subtotal;
    }

    public FlowerShopOrder(String bouquetType, int numberOfRoses) {
        this.bouquetType = bouquetType;
        this.numberOfRoses = numberOfRoses;
        this.costOfRoses = BigDecimal.valueOf(2.99).multiply(BigDecimal.valueOf(this.numberOfRoses));
        this.subtotal = BigDecimal.valueOf(19.99).add(costOfRoses);
    }

    public boolean isSameDay() {
        return this.sameDay;
    }

    public String getZipCode() {
        return this.zipCode;
    }


    public static BigDecimal calculateShipping(boolean sameDay, String zipCode) {
        int zipInt = Integer.parseInt(zipCode);
        BigDecimal zipCost;
        BigDecimal costForSameDay;
        BigDecimal totalCostOfShipping;
        if (zipInt > 9999 && zipInt < 20000) {
            zipCost = BigDecimal.ZERO;
        } else if (zipInt < 30000) {
            zipCost = BigDecimal.valueOf(3.99);
        } else if (zipInt < 40000) {
            zipCost = BigDecimal.valueOf(6.99);
        } else {
            zipCost = BigDecimal.valueOf(19.99);
        }

        if (sameDay) {
            costForSameDay = BigDecimal.valueOf(5.99);
        } else {
            costForSameDay = BigDecimal.ZERO;
        }
        totalCostOfShipping = zipCost.add(costForSameDay);
        return totalCostOfShipping;
    }

    @Override
    public String toString() {
        return "ORDER - " + this.bouquetType + " - " + this.numberOfRoses + " roses - " + this.subtotal;
    }
}