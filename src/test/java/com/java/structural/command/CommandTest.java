package com.java.structural.command;

import org.junit.Test;

/**
 * Created by Maskwang on 2018/9/11.
 */
public class CommandTest {

    @Test
    public void commandTest(){
        GameOperator gameOperator = new GameOperator();
        Command command = new LeftCommand(gameOperator);
        Invoker invoker = new Invoker(command);
        invoker.invoke();
    }
}
