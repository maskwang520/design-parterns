package com.java.structural.strategy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by maskwang on 18-7-3.
 * 策略模式的测试
 */
public class StrategyTest {

    @Test
    public void StrategyTest(){
        Context context = new Context(new AddOperation());
        Assert.assertEquals(context.execute(1,2),3);

        context = new Context(new MinusOperation());
        Assert.assertEquals(context.execute(1,2),-1);

        context = new Context(new MutliplyOperation());
        Assert.assertEquals(context.execute(1,2),2);
    }
}
