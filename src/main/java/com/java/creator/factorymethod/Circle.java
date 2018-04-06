package com.java.creator.factorymethod;

/**
 * Created by maskwang on 18-4-6.
 *
 * 具体的圆
 */
public class Circle implements Graph {

    float redius;

    public float getRedius() {
        return redius;
    }

    public void setRedius(float redius) {
        this.redius = redius;
    }

    public double getArea() {
        return this.redius*this.redius*Math.PI;
    }

}
