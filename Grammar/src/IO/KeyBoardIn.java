package IO;

import java.io.*;

public class KeyBoardIn {
    //将键盘录入的内容写到文件中
    public static void main(String[] args) throws IOException {
        // 1.先准备输入方向
        InputStream in = System.in;  // 属于字节流
        //字节流 ---> 字符流
        InputStreamReader isr = new InputStreamReader(in);
        //再套一个缓冲流, 增加效率
        BufferedReader br = new BufferedReader(isr);

        // 2.再准备输出方向
        File f = new File("D:/KeyBoardData.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        // 3.开始录入, 直接操作高级流
        String s = br.readLine();
        //设置录入结束标志
        while (!s.equals("exit")) {
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }
        bw.close();
        br.close();
    }
}
