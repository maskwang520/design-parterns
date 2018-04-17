package com.java.structural.decorator;

/**
 * Created by maskwang on 18-4-17.
 */
public class LowerToUperDecorator implements ReaderContent {

    ReaderContent readerContent;

    public String readContent() {

        String str = readerContent.readContent().toUpperCase();
        return str;
    }

    public LowerToUperDecorator(ReaderContent readerContent) {
        this.readerContent = readerContent;
    }
}
