package com.java.structural.templatemethod;

/**
 * Created by maskwang on 18-7-3.
 */
public class JdPurchase extends PurchaseOperation {

    @Override
    public void addCar() {
        System.out.println("京东购物--->加入购物车");
    }

    @Override
    public void accountMoney() {
        System.out.println("京东购物--->结账");
    }
}
