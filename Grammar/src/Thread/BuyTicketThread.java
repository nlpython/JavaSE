package Thread;

public class BuyTicketThread implements Runnable{
    // 一共十张票
    static int ticketNum = 100;

    // 每个窗口都是一个线程对象: 每个对象执行的代码放入run方法中
    @Override
    public void run() {
        // 每个窗口后面有100个人在抢票
        for (int i = 0; i < 100; i++){
            // 同步代码块
            synchronized (this) {
                if (ticketNum > 0) {
                    System.out.println("我在" + Thread.currentThread().getName() + "买到了第" + ticketNum-- + "张车票");
                }
            }
        }
    }

}
