package tomcat;

import java.io.IOException;

public abstract class httpServlet {

    // 定义常量
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POOST = "POST";


    public abstract void doGet(request rq, response rp) throws IOException;
    public abstract void doPost(request rq, response rp) throws IOException;

    /**
     * 根据请求方式来判断调用那种处理方法
     * @param rq
     * @param rp
     */

    public void service(request rq, response rp) throws IOException {
        if (METHOD_GET.equals(rq.getRequestMethod())) {
            doGet(rq, rp);
        } else if (METHOD_POOST.equals(rq.getRequestMethod())) {
            doPost(rq, rp);
        }
    }
}
