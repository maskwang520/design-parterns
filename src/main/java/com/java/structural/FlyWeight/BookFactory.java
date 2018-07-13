package com.java.structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by maskwang on 18-7-13.
 * 享元工厂类 一个类有很多对象,但是bookName相同的只能有一个实例
 */
public class BookFactory {

    //饿汉式单例
    private static BookFactory bookFactory = new BookFactory();

    //把享元类缓存起来,避免重复创建
    private Map<String,Book> map = new HashMap<String, Book>();

    private BookFactory(){

    }

    public static BookFactory getInstance(){
        return bookFactory;
    }

    //卖书
    public Book soldBook(String bookName){

        Book book = null;
        if(map.containsKey(bookName)){
           return map.get(bookName);
        }else{
            book = new Book(bookName);
            map.put(bookName,book);
        }
        return book;

    }

    //获取购买的数量
    public int getSoldNum(){
        return map.size();
    }




}
