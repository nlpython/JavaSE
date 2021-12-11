package TCP;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{
    Socket s = null;
    InputStream is = null;
    DataInputStream dis = null;
    ObjectInputStream ois = null;
    OutputStream os = null;
    DataOutputStream dos = null;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            // 2.等着客户端发来的信息
//            s = ss.accept(); // 阻塞方法：等待接受客户端的数据
            // accept()返回值是一个Socket，这个Socket其实就是客户端的Socket
            // 接到这个Socket以后，客户端才真正产生了连接，才能进行通信
            // 3.感受到的也是操作流
            is = s.getInputStream();
            dis = new DataInputStream(is);

            // 4.读取客户端发来的数据
//        String str = dis.readUTF();
//        System.out.println("客户端发来的数据为：" + str);
            ois = new ObjectInputStream(is);
            User user = null;
            try {
                user = (User)(ois.readObject());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            // 对对象进行验证
            boolean flag = false;
            if (user.getName().equals("2994056734") && user.getPassword().equals("y320349579..")) {
                flag = true;
            }

            // 向客户端返回结果
            os = s.getOutputStream();
            dos = new DataOutputStream(os);
//        dos.writeUTF("你好，我是服务器端，我已接受你的请求。");
            dos.writeBoolean(flag);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.关闭流 + 关闭网络资源
            try {
                if (dis != null)
                    dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (dos != null)
                    dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (s != null)
                    s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
