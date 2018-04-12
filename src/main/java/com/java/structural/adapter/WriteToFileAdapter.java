package com.java.structural.adapter;

/**
 * Created by maskwang on 18-4-10.
 * 我们把target类WriteToFile也适配WriteToDatabase
 * 优点：实现对类的重复利用，符合开闭原则
 * 缺点：明明调用的原来的接口，却被适配成另外一个接口。令人含糊
 */
public class WriteToFileAdapter implements WriteToFile {

    private WriteToDatabase writeToDatabase;

    public void writetoFile(LogBean logBean) {

        System.out.println("写入到文件被适配到数据库");

        writeToDatabase.writeToDatabase(logBean);

    }

    public WriteToFileAdapter(WriteToDatabase writeToDatabase) {
        this.writeToDatabase = writeToDatabase;
    }
}
