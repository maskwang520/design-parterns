package com.java.structural.strategy;

/**
 * Created by maskwang on 18-7-3.
 * 定义上下文类,用户通过这个类获取结果,屏蔽具体的策略调用
 */
public class Context {

    private MyOperation myOperation;

    public Context(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    public int execute(int num1, int num2) {
        return myOperation.getResult(num1, num2);
    }
}
