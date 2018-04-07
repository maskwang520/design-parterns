package com.java.creator.abastractfactory;

/**
 * Created by maskwang on 18-4-7.
 */
public class LenovoFactory implements Factory {

    public Mouse createMouse() {
        return new LenovoMouse();
    }

    public KeyBoard createKeyBoard() {
        return new LenovoKeyBoard();
    }
}
