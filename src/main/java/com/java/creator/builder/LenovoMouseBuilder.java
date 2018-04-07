package com.java.creator.builder;

/**
 * Created by maskwang on 18-4-7.
 */
public class LenovoMouseBuilder implements Buider {

    Mouse mouse = new LenovoMouse();

    public void setMouse(String name, String id) {

        mouse.setName(name);
        mouse.setId(id);

    }

    public Mouse getMouse() {

        return mouse;

    }
}
