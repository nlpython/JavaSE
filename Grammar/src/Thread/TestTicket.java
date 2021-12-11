package Thread;

public class TestTicket {
    public static void main(String[] args) {
        BuyTicketThread t = new BuyTicketThread();
        Thread t1 = new Thread(t, "窗口1");
        t1.start();
        Thread t2 = new Thread(t, "窗口2");
        t2.start();
        Thread t3 = new Thread(t, "窗口3");
        t3.start();
        System.out.println();
        for (int i = 0; i < 1; i ++) {
            System.out.println(i);
        }

    }
}
