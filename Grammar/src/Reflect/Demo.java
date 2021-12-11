package Reflect;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取字节码信息

        // 方式1.
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);

        // 方式2.
        Class c2 = Person.class; // c1 == c2

        // 方式1 和方式2 不常用
        // 方式3.
        Class.forName("Reflect.Person");
        // 方式4.(了解, 类的加载器)
        ClassLoader loader = Test.class.getClassLoader();
        Class c4 = loader.loadClass("Reflect.Person");
        /**
         * Class类的具体实例:
         * (1) 类: 外部类, 内部类
         * (2) 接口
         * (3) 注解
         * (4) 数组
         * (5) 基本数据类型
         * (6) void
         */
        /*Class c1 = Person.class;      // 类
        Class c2 = Comparable.class;  // 接口
        Class c3 = Override.class;    // 注解

        int[] arr1 = {1, 2, 3};
        Class c4 = arr1.getClass();
        int[] arr2 = {5, 6, 7};
        Class c5 = arr2.getClass();
        System.out.println(c4 == c5); // ture 同一个维度, 同一个元素类型, 得到的字节码信息相同

        Class c6 = int.class;
        Class c7 = void.class;*/
    }
}
