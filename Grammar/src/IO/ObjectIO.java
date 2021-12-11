package IO;

import java.io.*;

public class ObjectIO {
    // 对象输入输出流
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建自定义对象Person
        Person p = new Person(18, 185.2);

        // 将文件中的字符串写出到程序中:
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:/demo.txt")));
        oos.writeObject(p);

        // 将文件中的对象读入程序中:
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/demo.txt")));
        Person s = (Person)(ois.readObject());

        System.out.println(s);

        // 关闭流
        ois.close();
        oos.close();
    }
}
