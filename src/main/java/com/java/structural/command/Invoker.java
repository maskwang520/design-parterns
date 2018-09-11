package com.java.structural.command;

/**
 * Created by Maskwang on 2018/9/11.
 * 调用类
 */
public class Invoker {
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void invoke(){
        command.execute();
    }
}
