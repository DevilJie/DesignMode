package com.hsj.design.bean;

/**
 * 我们新建一个抽象类，为动物类
 */
public abstract class Animal {

    /**
     * 设置动物类的构造方法
     */
    public Animal(){
        /**
         * 共性的东西，放在这里
         */
        System.out.println("我在呼吸。。。");
        System.out.println("我在拉粑粑。。。");
    }
}
