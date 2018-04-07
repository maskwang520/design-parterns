package com.java.creator.builder;

/**
 * Created by maskwang on 18-4-7.
 */
public class DellMouse implements Mouse {

    String name;

    String id;

    public String info() {
        return name+id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
