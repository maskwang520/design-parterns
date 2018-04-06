package com.java.creator.simplefactory;

/**
 * Created by maskwang on 18-4-6.
 * 简单工厂模式
 * 优点：实现类的使用和创建分离
 * 缺点：违反开闭原则
 * 简单工厂模式适用情况包括：工厂类负责创建的对象比较少；客户端只知道传入工厂类的参数，对于如何创建对象不关心。
 */
public class SimpleFactory {

    public static Graph createGraph(String graphName){

        if(graphName.equals("Rectangle")){
            return new Rectangle();
        }

        if(graphName.equals("Cicle")){
            return new Cicle();
        }

        return null;
    }
}
