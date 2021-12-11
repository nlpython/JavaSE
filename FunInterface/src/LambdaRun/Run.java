package LambdaRun;

public class Run {
    public static void startThread(Runnable run) {
        // 多开线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        // 调用startThread方法, 方法的参数是一个函数接口, 那么我们可以传递lambda
        startThread(()->{
            System.out.println(Thread.currentThread().getName() + "线程启动了...");
        });
    }
}
