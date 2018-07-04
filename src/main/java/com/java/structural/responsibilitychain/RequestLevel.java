package com.java.structural.responsibilitychain;

/**
 * Created by maskwang on 18-7-4.
 * 请求等级的枚举类型
 */
public enum RequestLevel {
    LEVEL1("Leve1"),LEVEL2("Level2");

    private String msg;

    private RequestLevel(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
