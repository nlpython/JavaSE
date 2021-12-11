package DrinkingStore;

import java.util.Scanner;

public abstract class Drinking {
    private boolean ice;
    private String name;
    private int size;
    private int num;

    public void details() {
        Scanner in = new Scanner(System.in);
        System.out.println("是否加冰 :");
        String Ice = in.nextLine();
        if (Ice.equals("加冰")) {
            ice = true;
        } else {
            ice = false;
        }
        System.out.println("选择 1. 中杯  2. 大杯  3. 超大杯:");
        size = in.nextInt();
        System.out.println("购买数量 :");
        num = in.nextInt();
    }

    public void showDetails() {
        if (isIce()) {
            System.out.print("加冰, ");
        } else {
            System.out.print("不加冰, ");
        }
        int size = getSize();
        switch (size) {
            case 1 -> System.out.print("中杯");
            case 2 -> System.out.print("大杯");
            case 3 -> System.out.print("超大杯");
            default -> System.out.print("errors");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIce() {
        return ice;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getNum() {
        return num;
    }
}
