package com.java.structural.FlyWeight;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by maskwang on 18-7-13.
 */
public class FlyWeightTest {

    @Test
    public void flyWeightTest(){

        BookFactory bookFactory = BookFactory.getInstance();
        bookFactory.soldBook("book1");
        bookFactory.soldBook("book2");
        bookFactory.soldBook("book3");
        bookFactory.soldBook("book1");
        //只卖出3本,因为book1对象只创建一个
        Assert.assertEquals(bookFactory.getSoldNum(),3);
    }
}
