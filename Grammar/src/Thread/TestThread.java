package Thread;

public class TestThread extends Thread{
    // 只有继承Threa的类才具备争抢线程的权力
    @Override
    public void run() {
        // 输出 1-10
        for (int i = 0; i <= 10; i++){
            System.out.println(this.getName() + i);
        }
    }
}
