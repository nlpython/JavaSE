package DrinkingStore;

import java.util.Scanner;

public class Coffee extends Drinking {
    private String add;
    private double price = 8;

    public Coffee() {
        super.setName("咖啡");
        details();
    }

    public void details() {
        Scanner in = new Scanner(System.in);
        System.out.println("请问需要加糖或加奶吗?");
        add = in.nextLine();
        super.details();
    }

    @Override
    public void showDetails() {
        System.out.print("订单信息 : \n您购买了" + super.getName() + " : "  + add + ", ");
        super.showDetails();
        System.out.print(", " + super.getNum() + "杯, 总价: " + price * super.getNum());
    }
}
