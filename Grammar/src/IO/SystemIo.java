package IO;

import java.io.*;
import java.util.Scanner;

public class SystemIo {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
//        int n = in.read();
//        System.out.println(n);

//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
        //System.in 是一根管, 将管连接到键盘
        //Scanner是一个扫描器, 扫键盘这跟管出来的数据
        //Scanner不一定是扫System.in进来的东西, 还可以扫描其他管的内容:
        Scanner sc = new Scanner(new FileInputStream(new File("D:/demo.txt")));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }

        System.out.println("------------------");
        PrintStream out = System.out;
        out.println("你好");

    }
}
