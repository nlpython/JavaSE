package Exceptions;

import java.util.Scanner;

public class Catch {
    public static void main(String[] args) {
        // 异常的几种处理方式
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Please input first number:");
            int r = in.nextInt();
            System.out.println("Please input second number:");
            int l = in.nextInt();
            System.out.println("r / l = " + r / l);
        } catch(Exception ex) {
            // 1. 自定义处理
            System.out.println("对不起,你的代码有问题! ->1.");
            // 2. 调用toString()方法,显示异常的类名(全限定路径)
            System.out.println(ex + " ->2.");
            // 3. 显示异常描述信息对应的字符串,如果没有就显示null
            System.out.println(ex.getMessage() + " ->3.");
            // 4. 打印完整异常信息
            ex.printStackTrace();
            // 5. 抛出异常(将不会执行后续代码)
//            throw ex;
        }
        System.out.println("Bye!");
    }
}
