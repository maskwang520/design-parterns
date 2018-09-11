package com.java.structural.command;

/**
 * Created by Maskwang on 2018/9/11.
 * 向右的命令
 */
public class RightCommand implements Command {
    GameOperator gameOperator;

    public RightCommand(GameOperator gameOperator) {
        this.gameOperator = gameOperator;
    }

    public void execute() {
        gameOperator.goRight();
    }
}
