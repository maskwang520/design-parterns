package com.java.creator.singleton;

/**
 * Created by maskwang on 18-4-7.
 * 静态内部类实现，既实现懒加载
 * 同时读取实例的时候，没有加锁，没有性能缺陷
 */
public class StaticClassSingleton {

    public static class SingletonHodler{

        public static final StaticClassSingleton instance = new StaticClassSingleton();
    }

    public static StaticClassSingleton getInstance(){

        return SingletonHodler.instance;

    }

}
