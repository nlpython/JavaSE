package Enum;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        // enum的上层父类是java.lang.Enum
        // Enum中的常见方法：

        // toString()
        Season autumn = Season.AUTUMN;
        System.out.println(autumn);

        // values()
        Season[] values = Season.values();
        System.out.println(Arrays.toString(values));

        // valueOf(): 通过对象名字获取这个枚举对象
        // 注意：对象的名字必须传正确
        Season spring = Season.valueOf("SPRING");
        System.out.println(spring);

    }
}
