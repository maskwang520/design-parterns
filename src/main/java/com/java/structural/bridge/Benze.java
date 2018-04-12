package com.java.structural.bridge;

/**
 * Created by maskwang on 18-4-12.
 * 奔驰
 */
public class Benze extends Car{


    @Override
    public void run() {
        System.out.println("benze");
        transimition.gear();
    }
}
