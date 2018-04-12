package com.java.structural.bridge;

import org.junit.Test;

/**
 * Created by maskwang on 18-4-12.
 */
public class BridgeTest {


    @Test
    public void bridgeTest(){
        Car car = new Benze();
        //Transimition transimition = new AutoTransimition();
        Transimition transimition = new HandTransimition();
        car.setTransimition(transimition);
        car.run();
    }
}
