package DrinkingStore;

import java.util.Scanner;

public class Milk_tea extends Drinking {
    private String add;

    public Milk_tea() {
        super.setName("奶茶");
        details();
    }

    public void details() {
        Scanner in = new Scanner(System.in);
        System.out.println("请问需要椰果,红豆或者布丁吗?");
        add = in.nextLine();
        super.details();
    }

    @Override
    public void showDetails() {
        System.out.print("订单信息 : \n您购买了" + super.getName() + " : "  + add + ", ");
        super.showDetails();
        double price = 10;
        System.out.print(", " + super.getNum() + "杯, 总价: " + price * super.getNum());
    }

}
