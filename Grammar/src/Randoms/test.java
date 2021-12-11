package Randoms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test {
    // 获取30个随机不重复整数(范围在[0, 100)
    public static void main(String[] args) {
        // 创建标记数组
        boolean[] visit = new boolean[100]; // 默认为false
        int cnt = 0;
        while (cnt < 30) {
            int rand = (int)(Math.random()*100);
            if (!visit[rand]) {
                System.out.print(rand + " ");
                visit[rand] = true;
            } else {
                continue;
            }
            cnt++;
        }
        System.out.println("\n------------------------------");

        // 利用Set
        HashSet<Integer> sets = new HashSet<>();
        while (sets.size() <= 30) {
            int rand = (int)(Math.random()*100);
            sets.add(rand);
        }
        // 打印set
        // 1. 调用toString()
        System.out.println(sets);
        // 2. 使用迭代器
        Iterator<Integer> it = sets.iterator();
        while (it.hasNext()) { // hasNext()判断是否是最后一个数据
            System.out.print(it.next() + " "); // it.next()获取当前值,并往后移一位
        }
    }
}
