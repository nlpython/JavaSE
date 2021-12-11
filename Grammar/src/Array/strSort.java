package Array;

import java.util.Arrays;
import java.util.Comparator;

public class strSort {
    public static void main(String[] args) {
        String[] strs = new String[]{"Eric", "Jill", "Frank", "Amy"};
//        String类中已经实现了Comparable内部比较器, 故可以直接排序
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        // 可以通过自定义外部比较器改变排序准则
        Comparator<String> cmp = new MyComparator2();
        Arrays.sort(strs, cmp);
        System.out.println(Arrays.toString(strs));
    }
}

class MyComparator2 implements Comparator<String> {
    // 按照字符串长度排序
    @Override
    public int compare(String o1, String o2) {
        return o1.length() > o2.length() ? 1 : -1;
    }
}
