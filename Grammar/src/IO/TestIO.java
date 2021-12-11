package IO;

import java.io.*;

public class TestIO {
    //字节流处理非文本文件
    public static void main(String[] args) throws IOException {
        //有一个源文件
        File f1 = new File("D:/picture.jpg");
        //有一个目标文件
        File f2 = new File("D:/newPicture.jpg");
        //创建低级输出管道
        FileInputStream fis = new FileInputStream(f1);
        //创建低级输入管道
        FileOutputStream fos = new FileOutputStream(f2);
        //创建高级输入&输出管道
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //获取开始时间
        long startTime = System.currentTimeMillis();
        //开始传输数据
        byte[] b = new byte[1024 * 10];
        int len = bis.read(b);
        while (len != -1) {
            bos.write(b, 0, len);
            len = bis.read(b);
        }
        //获取结束时间
        long endTime = System.currentTimeMillis();
        //打印时间差
        System.out.println("复制完成的时间: " + (endTime - startTime) + "毫秒");

        //关闭高级输入输出流即可
        bos.close();
        bis.close();
    }
}
