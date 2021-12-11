package com.ys.Test;

public class Demo {
    public static void main(String[] args) {
        show(new FunInterImpl());
        show(()->{
            System.out.println("Hello world!");
        });
    }

    public static void show(MyFunctionInterface myInter) {
        myInter.method();
    }
}
