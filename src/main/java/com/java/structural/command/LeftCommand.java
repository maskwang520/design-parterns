package com.java.structural.command;

/**
 * Created by Maskwang on 2018/9/11.
 * 向左的命令
 */
public class LeftCommand implements Command{
    GameOperator gameOperator;

    public LeftCommand(GameOperator gameOperator) {
        this.gameOperator = gameOperator;
    }

    public void execute() {
        gameOperator.goLeft();
    }
}
