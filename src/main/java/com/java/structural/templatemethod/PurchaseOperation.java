package com.java.structural.templatemethod;

/**
 * Created by maskwang on 18-7-3.
 * 实现一个购物功能
 */
public abstract class PurchaseOperation {
    //加入购物车
    protected abstract void addCar();
    //结账
    protected abstract void accountMoney();
    //购物(final)不允许子类修改
    public final void buy(){
        addCar();
        accountMoney();
    }

}
