package Array;

import java.util.Arrays;
import java.util.Comparator;

public class intSort {
    public static void main(String[] args) {
        int n = 10;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("--------old arr----------");
        System.out.println(Arrays.toString(arr));

/*        // 排序   (冒泡)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("--------sorted arr--------");
        System.out.println(Arrays.toString(arr));*/

        // API
        Arrays.sort(arr);       // 默认升序
        System.out.println("--------ascending arr--------");
        System.out.println(Arrays.toString(arr));

        // 用接口实现降序 arr应为Integer数组
        Comparator cmp = new MyComparator1();
        Arrays.sort(arr, cmp);
//        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("--------descending arr--------");
        System.out.println(Arrays.toString(arr));
    }
}

class MyComparator1 implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o2 > o1) {
            return 1;
        } else {
            return 0;
        }
    }
}
