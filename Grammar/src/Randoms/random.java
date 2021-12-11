package Randoms;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        // 通过Math.random()方法
        for (int i = 0; i < 5; i++) {
            double rand = Math.random(); // 返回一个[0, 1)的随机浮点数
            System.out.println(rand);
        }

        // 通过Random类
        Random rand = new Random(); // 创建一个随机生成器
        for (int i = 0; i < 5; i++) {
            int rands = rand.nextInt(10); // 返回一个[0, 10)的随机整数
            System.out.println(rands);
        }
    }
}
