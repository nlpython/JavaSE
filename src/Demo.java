

public class Demo {
    public static void main(String[] args) {
        System.out.println("#include <iostream>\nusing namespace std;\nint main() {\n");
        System.out.println("\tcout << \"请给出一个不多于5位的正整数:\";\n\tint x;\n\tcin >> x;\n");
        System.out.println("\tswitch(x): {\n\t");

        for (int i = 1; i <= 10000; i++) {
            Integer num = i;
            int k = num.toString().length();
            StringBuilder strNum = new StringBuilder(num.toString()).reverse();
            String str = new String(strNum);
            System.out.println("\t\tcase " + i + ":");
            System.out.println("\t\t\t" + "cout << \"是" + k + "位数\" << endl;");
            System.out.println("\t\t\t" + "cout << \"个位数是" + str.charAt(0) + " << endl;");
            if (k > 1) {
                System.out.println("\t\t\t" + "cout << \"十位数是" + str.charAt(1) + " << endl;");
            }
            if (k > 2) {
                System.out.println("\t\t\t" + "cout << \"百位数是" + str.charAt(2) + " << endl;");
            }
            if (k > 3) {
                System.out.println("\t\t\t" + "cout << \"千位数是" + str.charAt(3) + " << endl;");
            }
            if (k > 4) {
                System.out.println("\t\t\t" + "cout << \"万位数是" + str.charAt(4) + " << endl;");
            }

            System.out.println("\t\t\t" + "cout << \"倒过来是" + Integer.parseInt(strNum.toString()) + "\" << endl;");
            System.out.println("\t\t\tbreak;");
        }

        System.out.println("\t}\n\treturn 0\n}");
    }
}

