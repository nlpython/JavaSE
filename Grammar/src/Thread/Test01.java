package Thread;

import java.util.ArrayList;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        // 给main方法这个主线程设置名字：
        Thread.currentThread().setName("主线程");

        for (int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + "1--" + i);
        }

        TestThread tt = new TestThread();
        // run直接调用就会被当作普通方法
        //tt.run();
        tt.start();  //start是Thread中的方法，作用是启动线程
        tt.setName("子线程");

        for (int i = 0; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + "2--" + i);
        }

    }
}
