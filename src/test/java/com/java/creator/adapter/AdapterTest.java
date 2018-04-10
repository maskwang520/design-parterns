package com.java.creator.adapter;

import org.junit.Test;

import java.util.Date;

/**
 * Created by maskwang on 18-4-10.
 */
public class AdapterTest {

    @Test
    public void adpateTest(){

        LogBean logBean = new LogBean();
        logBean.setDate(new Date("2018/4/10"));
        logBean.setMessage("write to database");
        WriteToDatabase writeToDatabase = new ConcreteToDatabase();

        WriteToFileAdapter adapter = new WriteToFileAdapter(writeToDatabase);

        adapter.writetoFile(logBean);
    }
}
