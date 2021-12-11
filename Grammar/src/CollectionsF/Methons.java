package CollectionsF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Methons {
    // Collections不是Collection接口，它是和Arrays类似的一个类，不能创建对象
    public static void main(String[] args) {
        // Collections中方法都被static修饰，直接通过类名调用即可
        // 常用方法：
        // addAll()
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("BB");
        list.add("CC");
        Collections.addAll(list, "dd", "ee", "ff");
        System.out.println(list);
        System.out.println("sort()---------------------");

        // sort()
        Collections.sort(list); // 默认升序
        System.out.println(list);
        System.out.println("binarySearch()-------------");

        // binarySearch()
        System.out.println(Collections.binarySearch(list, "CC"));
        System.out.println("copy()---------------------");

        // copy(): 替换方法
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "tt", "ss");
        Collections.copy(list, list2);  // 将list2的内容替换到list上去
        System.out.println(list);
        System.out.println(list2);
        System.out.println("fill()---------------------");

        // fill()
        Collections.fill(list2, "yyy");
        System.out.println(list2);
    }
}
