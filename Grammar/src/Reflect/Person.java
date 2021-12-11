package Reflect;

import java.io.Serializable;

public class Person implements Serializable {
    // 属性
    private int age;
    public String name;

    // 方法
    private void eat() {
        System.out.println("Person---eat");
    }
    public void sleep() {
        System.out.println("Person---sleep");
    }
}
