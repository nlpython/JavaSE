package IO;

import java.io.*;

public class DataIo {
    public static void main(String[] args) throws IOException {
        //DataOutputStream: 将内存的基本数据类型和字符串的变量写出文件:
        File f = new File("D:/demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);

        // 将变量写到文件中去
        dos.writeUTF("你好");
        dos.writeBoolean(false);
        dos.writeInt(7);

        //创建输入流
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);

        // 将文件内容读入程序中
        System.out.println(dis.readUTF());
        System.out.println(!dis.readBoolean());
        System.out.println(dis.readInt() + 1);

        // 关闭流
        dis.close();
        dos.close();
    }
}
