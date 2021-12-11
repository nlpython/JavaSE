package SomeFunInters;

import java.util.function.Predicate;

/**
 *  java.util.function.Predicate<T>接口
 *  作用: 对某种数据类型的数据进行判断, 返回一个boolean值
 *
 *  Predicate接口中包含一个抽象方法:
 *      boolean test(T t): 用来对指定数据类型进行判断的方法
 *
 *  默认方法:
 *      Predicate<T> and(Predicate<? super T> other)
 *          等同于 &&
 *      Predicate<T> or(Predicate<? super T> other)
 *          等同于 ||
 *      Predicate<T> negate()
 *          等同于 !
 */

public class predicate {
    /**
     * 定义一个方法
     *      参数传递一个String类型的字符串
     *      传递一个Predicate接口, 泛型使用String
     */
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }

    // 判断一个字符串是否既包含'H'又包含'w'
    public static void testAnd(Predicate<String> one, Predicate<String> two) {
        boolean isVaild = one.and(two).test("Hello world");
        // 等价于  return one.test("Hello world") && two.test("Hello world");
        System.out.println(isVaild);
    }
    public  static void testOr(Predicate<String> one, Predicate<String> two) {
        boolean isVaild = one.or(two).test("Hello world");
        // 等价于  return one.test("Hello world") || two.test("Hello world");
        System.out.println(isVaild);
    }
    public static void testNegate(Predicate<String> pre) {
        boolean flag = pre.negate().test("Hello world");
        System.out.println(flag);
    }


    public static void main(String[] args) {
        String s = "Hello";

        // 调用checkString进行检验
        boolean flag = checkString(s, (String str)->{
            return s.length() > 5;
        });
        System.out.println(flag);

        testAnd((String s1)->{
            return s1.contains("H");
        }, (String s2)->{
            return s2.contains("w");
        });

        testOr((String s1)->{
            return s1.contains("H");
        }, (String s2)->{
            return s2.contains("c");
        });

        testNegate((String s1)->{
            return s1.length() > 5;
        });

    }
}
