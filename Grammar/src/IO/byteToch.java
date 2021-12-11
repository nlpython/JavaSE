package IO;

import java.io.*;

public class byteToch {
    //字节流转换为字符流
    public static void main(String[] args) throws IOException {
        //源文件
        File f1 = new File("D:/Test.txt");
        //目标文件
        File f2 = new File("D:/demo.txt");
        //需要一个输入的字节流接触文件
        FileInputStream fis = new FileInputStream(f1);
        //加入一个转换流, 将字节流转换为字符流: (转换流属于一个处理流)
        //如果编码格式不统一的话, 控制台会出现乱码
        InputStreamReader isr = new InputStreamReader(fis, "utf-8");
        //输出
        FileOutputStream fos = new FileOutputStream(f2);
        OutputStreamWriter osw = new OutputStreamWriter(fos);

        //开始动作, 将文件中内容显示在控制台上
        char[] ch = new char[20];
        int len = isr.read(ch);
        while (len != -1) {
            osw.write(ch, 0, len);
            System.out.print(new String(ch, 0, len));
            len = isr.read(ch);
        }

        //关闭流
        osw.close();
        isr.close();
    }
}
