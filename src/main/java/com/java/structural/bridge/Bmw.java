package com.java.structural.bridge;

/**
 * Created by maskwang on 18-4-12.
 * 宝马
 */
public class Bmw extends Car {

    @Override
    public void run() {
        System.out.println("宝马车运行中");
        transimition.gear();
    }
}
