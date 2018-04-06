package com.java.creator.factorymethod;

/**
 * Created by maskwang on 18-4-6.
 * 定义具体的工厂，具体的工厂产生具体的类。这样当添加更多的图形的图形，只需要添加工厂类。满足开闭原则
 */
public class CircleFactory implements AbstarctFactory {

    public Graph createGraph() {
        return new Circle();
    }
}
