package com.java.structural.strategy;

/**
 * Created by maskwang on 18-7-3.
 * 定义乘法操作
 */
public class MutliplyOperation implements MyOperation {

    public int getResult(int num1, int num2) {
        return num1 * num2;
    }
}
