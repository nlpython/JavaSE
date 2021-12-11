package SomeFunInters;

import java.util.function.Supplier;

/**
 *  常用的函数式接口
 *  java.util.function.Supplier<T>接口仅包含一个无参的构造方法: T get().
 *  用来获取一个泛型参数指定类型的对象数据.
 *
 *  Supplier<T>接口被称之为生产型接口, 给什么类型, 返回什么类型
 */
public class supplier {
    /**
     *
     */
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String str = getString(()->{
            // 重写get
            return "Supplier Test.";
        });
        System.out.println(str);
    }
}
