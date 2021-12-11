package SomeFunInters;

import java.util.function.Function;

/**
 *  java.util.Function<T, R>
 *     接口用来根据一个类型的数据得到另一个类型的数据, 前者为前置条件, 后者为后置条件
 *  抽象方法:
 *      R apply(T t)
 *  默认方法:
 *      Function<T, R> andThen(Function<T, R>)
 *
 */

public class function {
    // 将String转化为Integer
    public static void testApply(String s, Function<String, Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    /**
     *  连续两次转化, 先将String->int, int += 10, int->String
     */
    public static void testAndThen(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String newString = fun1.andThen(fun2).apply(s);
        System.out.println(newString);
    }

    public static void main(String[] args) {
        // 定义一个字符串类型的整数
        String str = "1334";
        testApply(str, (String s)->{
            return Integer.valueOf(s);
        });

        testAndThen(str, (String s)->{
            return Integer.valueOf(s) + 10;
        }, (Integer in)->{
            return in.toString();
        });
    }
}
