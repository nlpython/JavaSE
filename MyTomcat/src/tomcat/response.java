package tomcat;

import java.io.IOException;
import java.io.OutputStream;

public class response {
    private OutputStream outputStream;

    public response(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String str) throws IOException {
        StringBuilder builder = new StringBuilder();
        builder.append("HTTP/1.1 200 OK\n")
                .append("Content-Type:text/html\n")
                .append("\r\n")
                .append("<html>")
                .append("<body>")
                .append("<hl>" + str + "</hl>")
                .append("</body>")
                .append("</html>");
        this.outputStream.write(builder.toString().getBytes());
        this.outputStream.flush();
        this.outputStream.close();
    }
}
