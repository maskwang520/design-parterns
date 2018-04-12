package com.java.structural.bridge;

/**
 * Created by maskwang on 18-4-12.
 *
 * 如果不是桥接模式，则每种车型都要实现手动档和自动档，这样会使得类爆炸
 * 主要优点是分离抽象接口及其实现部分
 * 桥接模式还提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统，实现细节对客户透明
 * 在这里如果还需要再拓展Transimition类，只需要添加类就可以，而不需要在每个具体的Car类中，进行添加
 * 面向接口编程
 */
public abstract class Car {

    public Transimition transimition;

    public void setTransimition(Transimition transimition) {
        this.transimition = transimition;
    }

    public abstract void run();
}
