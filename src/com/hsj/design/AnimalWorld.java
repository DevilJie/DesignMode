package com.hsj.design;

import com.hsj.design.bean.Cat;
import com.hsj.design.bean.Dog;
import com.hsj.design.bean.Tiger;

/**
 * 动物世界~~
 * 这是我们使用自己定义bean的方式
 * 直接在代码中 new 一个对象就可以直接使用。
 */
public class AnimalWorld {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.jump();
        Dog dog = new Dog();
        dog.jump();
        Tiger tiger = new Tiger();
        tiger.jump();
    }
}
