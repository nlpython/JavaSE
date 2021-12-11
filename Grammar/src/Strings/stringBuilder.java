package Strings;

/**
 * StringBuffer 和 StringBuilder 的基本方法调用完全一致
 * 将类换为StringBuffer下面代码仍可运行, 但方法内部有不同(多线程)
 */

public class stringBuilder {
    public static void main(String[] args) {

        // 验证StringBuilder的可变性
        StringBuilder s1 = new StringBuilder("abc");
        StringBuilder s2 = s1.append("def");
        System.out.println(s1 == s2);               // true说明地址未改变

        // 常用方法
        System.out.println("Methods:");
        StringBuilder sb = new StringBuilder("Hello World");

        // 增
        sb.append(", welcome");
        System.out.println(sb + " ->append");
        // 删
        sb.delete(3, 6); // 删除位置再[3, 6)上的字符
        System.out.println(sb + " ->delete");

        sb.deleteCharAt(16); // 删除位置在9上的字符
        System.out.println(sb + " ->deleteCharAt");

        // 改 -> 插入
        StringBuilder sb1 = new StringBuilder("AdoptOpenJDK");
        sb1.insert(5, ","); // 在下标为5的位置插入
        System.out.println(sb1 + " ->insert");
        // 改 -> 替换
        sb1.replace(5, 9, "Java"); // 在下标[5, 8)的位置插入字符串
        System.out.println(sb1 + " ->replace");

        // 查
        for (int i = 0; i < sb1.length(); i++) {
            System.out.print(sb1.charAt(i) + " ");
        }
        System.out.println(" ->charAt");

        // 截取
        String str = sb1.substring(0, 5);
        System.out.println(str + " ->substring");
    }
}
