package Reflect;


import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class cls = Student.class;

        // 通过字节码信息可以获取构造器
        // getConstructors只能获取当前运行时类的被public修饰的构造器
        Constructor[] c1 = cls.getConstructors();
        for (Constructor c : c1) {
            System.out.println(c);
        }

        System.out.println("---------------");
        // getDeclareConstructors: 获取运行时类的全部修饰符的构造器
        Constructor[] c2 = cls.getDeclaredConstructors();
        for (Constructor c : c2) {
            System.out.println(c);
        }
        System.out.println("---------------");

        // 获取指定的构造器
        // 获取空构造器
        Constructor con1 = cls.getConstructor();
        System.out.println(con1);
        // 得到两个参数的有参构造器
        Constructor con2 = cls.getConstructor(double.class, double.class);
        System.out.println(con2);
        // 得到一个参数的构造器, 并且是private修饰的
        Constructor con3 = cls.getDeclaredConstructor(int.class);
        System.out.println(con3);
        System.out.println("---------------");

        // 获取构造器后可创建对象
        Object obj1 = con1.newInstance();
        System.out.println(obj1);

        Object obj2 = con2.newInstance(124.2, 252.3);
        System.out.println(obj2);
        System.out.println("---------------");


        // 获取属性并赋值
        // getFields: 获取运行时类和父类中被public修饰的属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("---------------");

        // getDeclaredFields 可获取运行时类中的所有属性
        Field[] declatedFields = cls.getDeclaredFields();
        for (Field f : declatedFields) {
            System.out.println(f);
        }

        // 获取指定的属性 getField or getDeclaredField
        Field field1 = cls.getField("score");       //获取public类型属性
        System.out.println(field1);
        Field field2 = cls.getDeclaredField("sno"); //获取所有类型属性
        System.out.println(field2);
        System.out.println("---------------");

        // 属性的具体结构
        // 获取属性的名字
        String name = field2.getName();
        System.out.println(name);
        // 获取属性数据类型
        Class type = field2.getType();
        System.out.println(type.getName());
        // 获取属性修饰符
        int modifiers = field2.getModifiers();   // modifiers表示修饰符对应的数字
        System.out.println(modifiers);
        System.out.println(Modifier.toString(modifiers));  // 静态方法将该数字转为String
        // 给属性赋值
        Field sco = cls.getField("score");
        Object obj = cls.newInstance();
        sco.set(obj, 98);   // 给obj这个对象的score属性设置为具体的值(98)
        System.out.println(obj);
        System.out.println("---------------");

        // 获取方法和调用方法
        // getMethods获取所有public修饰的方法和父类方法
        Method[] methods = cls.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("---------------");
        // getDeclaredMethods() 获取所有方法(不能获取父类方法)
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
        System.out.println("---------------");

        // 获取指定方法  getDeclaredMethod获取所有修饰符方法
        Method showInfo1 = cls.getMethod("showInfo", int.class, double.class);
        Method showInfo2 = cls.getMethod("showInfo", int.class);
        System.out.println(showInfo1);
        System.out.println(showInfo2);
        System.out.println("---------------");

        // 获取方法的具体结构
        // 获取方法名字
        System.out.println(showInfo1.getName());
        // 获取方法修饰符
        int modifiers1 = showInfo1.getModifiers();
        System.out.println(Modifier.toString(modifiers1));
        // 获取方法返回值
        System.out.println(showInfo1.getReturnType());
        // 获取参数列表
        Class[] parameterTypes = showInfo1.getParameterTypes();
        for (Class c : parameterTypes) {
            System.out.print(c + " ");
        }
        System.out.println("\n-------------");
        // 调用方法
        Object o = cls.newInstance();
        Method MyMethod = cls.getMethod("MyMethod");
        // 调用o对象的MyMethod方法
        MyMethod.invoke(o);
        showInfo1.invoke(o, 12, 65.5);
    }
}
