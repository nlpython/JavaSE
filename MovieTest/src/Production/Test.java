package Production;

public class Test {
    public static void main(String[] args) {
        Product p = new Product();

        Customer ct = new Customer(p);
        Productor pd = new Productor(p);

        ct.start();
        pd.start();
    }
}
