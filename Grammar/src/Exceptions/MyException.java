package Exceptions;

public class MyException extends Exception{ // 继承检查异常
    // 自定义异常
    static final long serialVersionUID = -28934912497L;

    public MyException() {}

    public MyException(String msg) {
        super(msg);
    }
}
