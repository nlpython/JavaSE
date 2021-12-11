package packbag;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class Port {
    public static void main(String[] args) {
        // 封装端口号
        InetSocketAddress isa = new InetSocketAddress("192.168.142.195", 8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());  // 端口号

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }
}
