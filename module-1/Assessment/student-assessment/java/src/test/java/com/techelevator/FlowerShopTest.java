package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class FlowerShopTest {

    @Test
    public void subTotal_test_returns_correctly_for_2_roses(){
    FlowerShopOrder sut = new FlowerShopOrder("standard", 2);
        BigDecimal result = sut.getSubtotal();
        Assert.assertEquals(BigDecimal.valueOf(25.97), result);
    }
    @Test
    public void subTotal_test_returns_correctly_for_0_roses(){
        FlowerShopOrder sut = new FlowerShopOrder("standard", 0);
        BigDecimal result = sut.getSubtotal();
        Assert.assertEquals(BigDecimal.valueOf(19.99), result);
    }

    @Test
    public void delivery_fee_3_99_for_20000(){
       BigDecimal sut = FlowerShopOrder.calculateShipping(false, "20000");
        Assert.assertEquals(BigDecimal.valueOf(3.99), sut);
    }
    @Test
    public void delivery_fee_3_99_for_29999(){
        BigDecimal sut = FlowerShopOrder.calculateShipping(false, "29999");
        Assert.assertEquals(BigDecimal.valueOf(3.99), sut);
    }
    @Test
    public void delivery_fee_6_99_for_30000(){
        BigDecimal sut = FlowerShopOrder.calculateShipping(false, "30000");
        Assert.assertEquals(BigDecimal.valueOf(6.99), sut);
    }
    @Test
    public void delivery_fee_6_99_for_39999(){
        BigDecimal sut = FlowerShopOrder.calculateShipping(false, "39999");
        Assert.assertEquals(BigDecimal.valueOf(6.99), sut);
    }
    @Test
    public void delivery_fee_0_for_free_range(){
        BigDecimal sut1 = FlowerShopOrder.calculateShipping(false, "10000");
        BigDecimal sut2 = FlowerShopOrder.calculateShipping(false, "19999");
        Assert.assertEquals(BigDecimal.ZERO, sut1);
        Assert.assertEquals(BigDecimal.ZERO, sut2);
    }
    @Test
    public void delivery_fee_19_99_when_out_of_range(){
        BigDecimal sut = FlowerShopOrder.calculateShipping(false, "40001");
        Assert.assertEquals(BigDecimal.valueOf(19.99), sut);
    }



}
