package com.java.creator.builder;

/**
 * Created by maskwang on 18-4-7.
 *
 * 对类的构造交给director来控制，Builder用于构建比较复杂的类
 */
public class Director {

    Buider buider;

    public Director(Buider buider){
        this.buider = buider;
    }

    public Mouse createMouse(String name, String id) {

        buider.setMouse(id, name);
        return buider.getMouse();
    }


}
