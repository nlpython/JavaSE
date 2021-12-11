package MyLIinkedList;

import java.util.Arrays;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.add("Jill");
        mll.add(0, "May");
        mll.add("Amy");
        mll.set(2, "Eric");
        Object[] arr = mll.toArray();
        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr));
    }
}
