package tomcat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    /**
     * 定义服务端的接受程序，接受socket请求
     * @param port
     */
    public static void StartServer(int port) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 定义服务端套接字
        ServerSocket serverSocket = new ServerSocket(port);
        // 定义客户端套接字
        Socket socket = null;

        while (true) {
            socket = serverSocket.accept();

            // 获取输入输出流
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            // 定义请求对象
            request rq = new request(inputStream);
            // 定义响应对象
            response rp = new response(outputStream);

            String clazz = new mapping().getMap().get(rq.getRequestURL());
            if (clazz != null) {
                Class<servlet> myServletClass = (Class<servlet>)Class.forName(clazz);
                // 根据myServletClass创建对象
                servlet myServlet = myServletClass.newInstance();
                myServlet.service(rq, rp);
            }
        }
    }

    public static void main(String[] args) {
        try {
            StartServer(10086);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
