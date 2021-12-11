package IO;

import java.io.*;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/test.txt");
        File f2 = new File("D:/demo.txt");

        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);

        char[] ch = new char[10];
        int len = fr.read(ch);
        while (len != -1) {
            fw.write(ch);
            len = fr.read(ch);
        }

        fr.close();
        fw.close();
    }
}
