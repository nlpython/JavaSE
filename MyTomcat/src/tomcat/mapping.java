package tomcat;

import java.util.HashMap;

public class mapping {
    // 映射关系

    public static HashMap<String, String> map = new HashMap<>();

    static {
        map.put("/MyTomcat", "tomcat.httpServlet");
    }

    public HashMap<String, String> getMap() {
        return map;
    }
}
