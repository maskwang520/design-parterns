package com.java.creator.simplefactory;

/**
 * Created by maskwang on 18-4-6.
 */
public class Cicle implements Graph {

    float redius;

    public double getArea() {
        return this.redius * this.redius * Math.PI;
    }

    public float getRedius() {
        return redius;
    }

    public void setRedius(float redius) {
        this.redius = redius;
    }
}
