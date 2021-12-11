package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(1);
        al.add(4);
        System.out.println(al.toString() + " ->old Array");
        Collections.reverse(al);
        System.out.println(al.toString() + " ->reversed Array");
    }
}
