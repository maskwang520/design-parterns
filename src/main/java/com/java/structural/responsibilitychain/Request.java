package com.java.structural.responsibilitychain;

/**
 * Created by maskwang on 18-7-4.
 * 消息请求
 */
public class Request {

    private String requestMsg;

    private RequestLevel requestLevel;

    public Request(String requestMsg) {
        this.requestMsg = requestMsg;
    }

    public String getRequestMsg() {
        return requestMsg;
    }

    public void setRequestMsg(String requestMsg) {
        this.requestMsg = requestMsg;
    }

    public RequestLevel getRequestLevel() {
        return requestLevel;
    }

    public void setRequestLevel(RequestLevel requestLevel) {
        this.requestLevel = requestLevel;
    }
}
