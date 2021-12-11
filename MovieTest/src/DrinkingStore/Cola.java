package DrinkingStore;

import java.util.Scanner;

public class Cola extends Drinking {
    private String spices;
    private double price = 3;

    public Cola() {
        Scanner in = new Scanner(System.in);
        System.out.println("请录入你需要的可乐的信息(备注百事可乐或可口可乐)");
        spices = in.nextLine();
        super.setName(spices);
        details();
    }

    public void details() {
        super.details();
    }

    @Override
    public void showDetails() {
        System.out.print("订单信息 : \n您购买了" + super.getName() + " : ");
        super.showDetails();
        System.out.print(", " + super.getNum() + "杯, 总价: " + price * super.getNum());
    }
}
