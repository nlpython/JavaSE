package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // 服务器
    public static void main(String[] args){
        System.out.println("启动服务器端...");
        int count = 0; // 计数器

        // 1.创建套接字，指定服务器的端口号
        ServerSocket ss = null;
        Socket s = null;

        try {
            ss = new ServerSocket(8080);
            // 2.等着客户端发来的信息
            while (true) {
                s = ss.accept(); // 阻塞方法：等待接受客户端的数据
                // 每次过来的客户端请求靠线程处理
                new ServerThread(s).start();

                count++;
                System.out.println("当前是第" + count + "个用户访问我们的服务器，对应的用户是：" + s.getInetAddress());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
