package Production;

public class Customer extends Thread {
    Product p;

    public Customer(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        synchronized (p) {
            for (int i = 1; i <= 10; i++) {
                p.getProduct();
            }
        }
    }
}
