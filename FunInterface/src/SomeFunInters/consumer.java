package SomeFunInters;

import java.util.function.Consumer;

/**
 *  java.util.function.Consumer<T>接口则正好与Supplier接口相反, 它消费一个数据, 类型由泛型决定
 *
 *  接口包含void accept(T t)唯一一个抽象方法
 *  还包含andThen(Consumer<T>)这个默认方法
 */

public class consumer {
    // accept()
    public static void method1(String name, Consumer<String> con) {
        con.accept(name);
    }
    // andThen()
    public static void method2(String name, Consumer<String> con1, Consumer<String> con2) {
        // 先执行con1, 后执行con2
        con1.andThen(con2).accept(name);
    }

    public static void main(String[] args) {
        method1("Java", (String name)->{
            // 原样打印
            System.out.println(name);

            // 反转打印
//            StringBuilder stb = new StringBuilder(name);
//            stb.reverse();
            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);
        });

        method2("Html", (String name)->{
            System.out.println(name);
        },
        (String name)->{
            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);
        });

    }
}
