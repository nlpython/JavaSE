package packbag;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP {
    public static void main(String[] args) throws UnknownHostException {
        // 封装IP:
        InetAddress ia1 = InetAddress.getByName("192.168.142.195");
        System.out.println(ia1);

        InetAddress ia2 = InetAddress.getByName("localhost"); // localhost是本机ip地址
        System.out.println(ia2);

        InetAddress ia3 = InetAddress.getByName("www.baidu.com");
        System.out.println(ia3);
        System.out.println(ia3.getHostAddress()); // 获取ip地址
        System.out.println(ia3.getHostName());    // 获取域名
    }
}
