package com.java.creator.simplefactory;

/**
 * Created by maskwang on 18-4-6.
 * 实现具体的类，矩形类
 */
public class Rectangle implements Graph {

    float height;

    float width;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }
}
