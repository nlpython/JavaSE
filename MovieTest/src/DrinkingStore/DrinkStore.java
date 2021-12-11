package DrinkingStore;

import java.util.Scanner;

public class DrinkStore {
    public static Drinking buyDrinking() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您要购买的饮品 : 1. 可乐  2. 咖啡  3. 奶茶");
        int name = in.nextInt();
        Drinking drinking = null;
        switch (name) {
            case 1:
                drinking = new Cola();
                break;
            case 2:
                drinking = new Coffee();
                break;
            case 3:
                drinking = new Milk_tea();
                break;
        }
        return drinking;
    }

    public static void main(String[] args) {
        Drinking drinking = DrinkStore.buyDrinking();
        drinking.showDetails();
    }
}
