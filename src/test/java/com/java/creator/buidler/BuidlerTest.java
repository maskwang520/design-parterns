package com.java.creator.buidler;

import com.java.creator.builder.*;
import org.junit.Test;

import java.util.UUID;

/**
 * Created by maskwang on 18-4-7.
 */
public class BuidlerTest {

    @Test
    public void builderTest(){

        Buider dellBuider = new DellMouseBuilder();
        Buider lenovoBuider = new LenovoMouseBuilder();

        Director director = new Director(lenovoBuider);
//        DellMouse mouse = (DellMouse) director.createDellMouse();
//        System.out.println(mouse.getName()+": "+mouse.getId());
        LenovoMouse mouse = (LenovoMouse) director.createMouse("dellmouse", UUID.randomUUID().toString());
        System.out.println(mouse.getName()+": "+mouse.getId());

    }
}
