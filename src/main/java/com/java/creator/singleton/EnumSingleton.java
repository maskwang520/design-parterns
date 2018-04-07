package com.java.creator.singleton;

/**
 * Created by maskwang on 18-4-7.
 * 直接通过枚举来实现。枚举天然是线程安全的，然后，可以实现懒加载。还可以排除反序列化创建实例
 */
public enum  EnumSingleton {

    INSTNCE;
}
