package com.java.structural.facade;

/**
 * Created by maskwang on 18-7-5.
 * 门面  实现客户端与具体调用类的解耦
 */
public class Facade {

    private Operation orderOperation = new OrderOperation();
    private Operation translateOperation = new TranslateOperation();
    private Operation afterSale = new AfterSale();

    //一系列的操作都在门面里面完成,那么客户端调用的时候只需要调用门面,相当于屏蔽了很多细节
    public void purchase() {

        order();

        //物流
        translate();

        //售后
       afterSale();
    }

    //下订单
    public void order(){
        orderOperation.operation();
    }

    //物流
    public void translate(){
        translateOperation.operation();
    }

    public void afterSale(){
        afterSale.operation();
    }
}
