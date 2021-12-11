package TCP;

import java.io.Serializable;

public class User implements Serializable {
    // 将账号和密码封装成一个对象
    private static final long serialVersionUID = 8413117624497683348L;

    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
