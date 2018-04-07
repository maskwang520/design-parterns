package com.java.creator.singleton;

/**
 * Created by maskwang on 18-4-7.
 * 为了线程安全，且有效率，出现了下面的duoble check的形式。但是这种方式还是有线程安全的
 *1. 给 instance 分配内存
  2.调用 Singleton 的构造函数来初始化成员变量
  3.将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）

 * 在这过程的问题是2,3的顺序不保证，有可能重排序。如果是1,3，2的顺序，则另一个进来的线程则判断非null,然后return
 * 但是当它真正使用的时候，还是会报错，原因是未初始化
 * 把instance声明volatile的时候，能阻止指令重排序
 */
public class DoubleCheckSingleton {

    public static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {

        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {  //避免在这加锁过程中创建了实例，所以要再次check
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }

        return instance;
    }


}
