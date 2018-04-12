package com.java.structural.adapter;

/**
 * Created by maskwang on 18-4-10.
 * 写入到文件的具体实现类
 */
public class ConcreteToFile implements WriteToFile {

    public void writetoFile(LogBean logBean) {

        System.out.println("写入到文件中"+logBean);

    }
}
