package com.java.creator.simplefactory;

import org.junit.Test;

/**
 * Created by maskwang on 18-4-6.
 */
public class SimpleFactoryTest {

    @Test
    public void simpleFacotryTest(){
        Cicle cicle = (Cicle) SimpleFactory.createGraph("Cicle"); //强制转换
        cicle.setRedius(1);
        double result = cicle.getArea();
        System.out.println(result);
    }
}
