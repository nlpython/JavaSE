package tomcat;

import java.io.IOException;

public class servlet extends httpServlet{

    @Override
    public void doGet(request rq, response rp) throws IOException {
        rp.write("myTomcat");
    }

    @Override
    public void doPost(request rq, response rp) throws IOException {
        rp.write("post tomcat");
    }
}
