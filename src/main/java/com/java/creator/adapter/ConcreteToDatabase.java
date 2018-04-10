package com.java.creator.adapter;

/**
 * Created by maskwang on 18-4-10.
 * 写入到数据库具体的实现类
 */
public class ConcreteToDatabase implements WriteToDatabase {

    public void writeToDatabase(LogBean logBean) {

        System.out.println("写入到数据库里面"+logBean);
    }
}
