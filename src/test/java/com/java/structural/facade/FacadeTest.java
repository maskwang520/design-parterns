package com.java.structural.facade;

import org.junit.Test;

/**
 * Created by maskwang on 18-7-5.
 */
public class FacadeTest {

    @Test
    public void facadeTest(){
        Facade facade = new Facade();
        //客户端只需要调用门面一个函数,就可以完成一系列的操作
        facade.purchase();

        //单独一个操作
        facade.order();
    }
}
