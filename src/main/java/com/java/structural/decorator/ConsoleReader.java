package com.java.structural.decorator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by maskwang on 18-4-17.
 * 从控制台输入字符串
 */
public class ConsoleReader implements ReaderContent {

    public String readContent() {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str =  in.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        return str;
    }
}
