package MethodQuote;

public class Quote {
    public static void Print(Printable p) {
        p.print("Hello world");
    }

    public static void main(String[] args) {
        // 调用Print()方法, 方法的参数Printable是一个函数式接口, 所以可以传递Lambda
        Print(s-> System.out.println(s));

        /**
         *  分析:
         *      lambda表达式的目的: 打印参数传递的字符串
         *      把参数s, 传递给System.out对象, 调用out对象中的方法println对字符串进行输出
         *      注意:
         *          1. System.out对象是已经存在的
         *          2. println也是已经存在的
         *          所有可以使用方法引用来优化Lambda表达式
         *      可以使用System.out方法直接引用(调用)println方法
         */
        Print(System.out::println);
        /**
         *  双冒号::为引用运算符, 而它所在的表达式被称为方法引用. 如果Lambda要表达的函数方案已经存在于
         *  某个方法实现中, 那么则可以通过双冒号来引用该方法作为Lambda的替代者
         */
    }
}
