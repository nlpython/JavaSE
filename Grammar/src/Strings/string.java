package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String->char[]
        String a = "hello";
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n-----------------");
        // char[]->String
        // 1. 构造器
        char[] chs = new char[]{'a', 'b', 'd', 'f'};
        String b = new String(chs);
        System.out.println(b);
        // 2. copyValueOf()静态方法,或valueOf()
        String c = String.copyValueOf(chs);
        System.out.println(c);
        System.out.println("-------------------");

        // 将String转成相应的int或double
        String s1 = "-1248424";
        int num1 = Integer.parseInt(s1);
        String s2 = "34.254";
        double num2 = Double.parseDouble(s2);
        System.out.println("int -> " + num1);
        System.out.println("double -> " + num2);
        //
    }
}
