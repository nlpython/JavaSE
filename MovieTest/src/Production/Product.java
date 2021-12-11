package Production;

public class Product {
    private String brand;
    private String name;
    public boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public Product() {}

    public synchronized void setProduct(String brand, String name) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了" + this.getBrand() + this.getName());
        flag = true;
        notify();
    }

    public synchronized void getProduct() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("消费者购买了" + this.getBrand() + this.getName());
        flag = false;
        notify();
    }
}
