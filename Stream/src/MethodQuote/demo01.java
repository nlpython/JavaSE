package MethodQuote;

/**
 *  通过对象名引用成员方法
 *  使用前提是对象名已经存在, 成员方法也存在
 *  就可以使用对象名来引用成员方法
 */

public class demo01 {
    public static void printString(Printable p) {
        p.print("Hello");
    }

    public static void main(String[] args) {
        // 调用printString方法
        printString((s)->{
            // 创建MethodRerObject对象

        });
    }
}
