package com.java.creator.singleton;

/**
 * Created by maskwang on 18-4-7.
 *
 * 懒汉式，把实例作为static成员变量，但是这种方法是线程不安全的
 * 可以在getInstance方法上加锁，实现线程安全的获取实例
 */
public class Singleton {

    private static Singleton instance;


    public static Singleton getInstance(){

        //不为Null时候创建实例。多个线程的时候会出现问题
        if(instance == null){
            instance = new Singleton();
        }

        return instance;

    }

    //私有化构造器
    private Singleton(){

    }


    //线程安全的方式
    public synchronized static Singleton getSingleton(){

        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

}
