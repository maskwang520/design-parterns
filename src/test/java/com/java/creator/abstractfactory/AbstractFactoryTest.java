package com.java.creator.abstractfactory;

import com.java.creator.abastractfactory.DellFactory;
import com.java.creator.abastractfactory.DellKeyBoard;
import com.java.creator.abastractfactory.DellMouse;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by maskwang on 18-4-7.
 */
public class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest(){

        DellFactory dellFactory = new DellFactory();
        DellMouse dellMouse = (DellMouse)dellFactory.createMouse();
        DellKeyBoard dellKeyBoard = (DellKeyBoard) dellFactory.createKeyBoard();

        Assert.assertEquals("dellmouse",dellMouse.getName());
        Assert.assertEquals("dellkeyboard",dellKeyBoard.getName());


    }
}
