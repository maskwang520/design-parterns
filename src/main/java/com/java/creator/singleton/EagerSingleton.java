package com.java.creator.singleton;

/**
 * Created by maskwang on 18-4-7.
 * 这是一种饿汉式的加载，声明为final和static，类加载的时候就会创建实例。所以不用担心线程安全
 * 但是，它的问题的是加载的时机太早，总会保留在内存里面。另一方面，如果要在运行期间
 * 动态设置该类的属性，则无法做到。
 */
public class EagerSingleton {

    public  static final EagerSingleton instance = new EagerSingleton();

    public EagerSingleton getInstance(){

        return instance;

    }

}
