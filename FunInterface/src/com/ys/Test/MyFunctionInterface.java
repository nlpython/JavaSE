package com.ys.Test;

/**
 *  函数式接口, 有且只有一个抽象方法的接口
 *  接口中还可包含其他方法, 如默认,私有,静态
 *
 *  @FunctionalInterface检测是否为函数式接口
 */

@FunctionalInterface
public interface MyFunctionInterface {
    // 定义一个抽象方法
    public abstract void method();
}
