package TCP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    // 客户端
    public static void main(String[] args){
        System.out.println("启动客户端...");

        // 1.获取套接字：指定服务器的ip和端口号（这里使用本机）
        Socket s = null;
        OutputStream os = null;
        DataOutputStream dos = null;
        ObjectOutputStream oos = null;
        InputStream is = null;
        DataInputStream dis = null;
        try {
            s = new Socket("192.168.142.195", 8080);

            // 录入账号密码：
            Scanner in = new Scanner(System.in);
            System.out.println("请录入您的账号：");
            String name = in.nextLine();
            System.out.println("请录入您的密码：");
            String password = in.nextLine();

            // 将账号和密码封装成一个对象
            User user = new User(name, password);


            // 2.对于程序员来说，向外发送数据 感受->利用输出流：
            os = s.getOutputStream();
            dos = new DataOutputStream(os);
            // 利用OutputStream就可以向外发送数据了，但是没有直接发送String的方法
            // 所以我们又在OutputStream外面套了一个处理流：DataOutputStream
            //        dos.writeUTF("你好，服务器端。");
            // 套一个ObjectOutputStream流可直接发送对象
            oos = new ObjectOutputStream(os);
            oos.writeObject(user);

            // 接受服务器端的回话
            is = s.getInputStream();
            dis = new DataInputStream(is);
            //        String str = dis.readUTF();
            //        System.out.println("服务器端对我说：" + str);
            boolean result = dis.readBoolean();
            if (result) {
                System.out.println("登录成功！");
            } else {
                System.out.println("账户不存在或密码错误！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3.关闭网络资源 + 关闭流
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (s != null) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
