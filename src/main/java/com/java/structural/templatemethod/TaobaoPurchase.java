package com.java.structural.templatemethod;

/**
 * Created by maskwang on 18-7-3.
 */
public class TaobaoPurchase extends PurchaseOperation {

    @Override
    protected void addCar() {
        System.out.println("淘宝购物--->加入购物车");
    }

    @Override
    protected void accountMoney() {
        System.out.println("淘宝购物--->结账");
    }
}
