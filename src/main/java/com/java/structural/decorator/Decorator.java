package com.java.structural.decorator;

import sun.misc.BASE64Encoder;

/**
 * Created by maskwang on 18-4-17.
 * 这里的装饰器相当于在原来的基础上加了一层
 */
public class Decorator implements ReaderContent {

    ReaderContent readerContent;

    public Decorator(ReaderContent readerContent) {
        this.readerContent = readerContent;
    }

    public String readContent() {
        String str = readerContent.readContent();
        BASE64Encoder encoder = new BASE64Encoder();

        encoder.encode(str.getBytes());
        return encoder.encode(str.getBytes());

    }
}
