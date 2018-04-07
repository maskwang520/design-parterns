package com.java.creator.abastractfactory;

/**
 * Created by maskwang on 18-4-7.
 *
 * 如果要创建一种新的产品，那么还是会违背开闭原则，得重新修改这个接口
 * 但是对于构建不同的工厂，只需要实现Factory接口就行
 *
 * 抽象工厂和工厂方法的区别： 工厂方法每个具体的工厂类，只会生产某一个具体的产品
 * 而抽象工厂则是生产一套产品（一个抽象工厂对应多个具体产品）
 */
public class DellFactory implements Factory {

    public Mouse createMouse() {
        return new DellMouse();
    }

    public KeyBoard createKeyBoard() {
        return new DellKeyBoard();
    }
}
