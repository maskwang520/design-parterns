package com.java.structural.responsibilitychain;

/**
 * Created by maskwang on 18-7-4.
 */
public class Handler1 extends Handler {

    @Override
    public void echo(Request request) {
        System.out.println("handler1 start handler ...");
        System.out.println(request.getRequestMsg());
    }

}
