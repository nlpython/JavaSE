package Traverse;

import java.util.ArrayList;
import java.util.List;

public class demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pill");
        list.add("Amy");
        list.add("Mike");
        list.add("Paul");
        list.add("Eric");

        // 对list集合中的元素进行遍历(传统方式)
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("---------------------");

        // 使用Stream流遍历和过滤
        list.stream().filter(name->name.startsWith("P"))
                .filter(name->name.length()>3).forEach(name-> System.out.println(name));
    }
}
