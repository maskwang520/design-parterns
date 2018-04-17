package com.java.structural.decorator;

/**
 * Created by maskwang on 18-4-17.
 * <p>
 * 1. Object responsibilities and behaviours should be dynamically modifiable
 * 2. Concrete implementations should be decoupled from responsibilities and behaviours
 */
public class DecoratorTest {


    public static void main(String[] args) {
        //实现编码
        ReaderContent readerContent = new Decorator(new ConsoleReader());
        System.out.println(readerContent.readContent());

        //实现把输入字符串全部转换成大写

        ReaderContent readerUpperContent = new LowerToUperDecorator(new ConsoleReader());
        System.out.println(readerUpperContent.readContent());

    }
}
