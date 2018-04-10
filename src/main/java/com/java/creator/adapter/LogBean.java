package com.java.creator.adapter;

import java.util.Date;

/**
 * Created by maskwang on 18-4-10.
 * 定义基础的我们想要操作的类
 */
public class LogBean {

    Date date;

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "LogBean{" +
                "date=" + date +
                ", message='" + message + '\'' +
                '}';
    }
}
