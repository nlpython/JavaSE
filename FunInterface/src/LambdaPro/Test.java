package LambdaPro;

/**
 *  使用lambda优化日志案例
 *  Lambda的特点: 延迟加载
 *  Lambda的使用前提: 必须存在函数式接口
 */

public class Test {
    // 定义一个显示日志的方法, 方法的参数传递日志的等级和MessageBuilder和builderMessage方法
    public static void showLog(int level, MessageBuilder message) {
        if (level == 1) {
            System.out.println(message.builerMessage());
        }
    }

    public static void main(String[] args) {
        // 定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        // 调用showLog方法, 参数式messageBuilder是一个函数式接口, 可以传递Lambda表达式
        showLog(1, ()->{
            // 返回拼接的字符串
            return msg1 + msg2 + msg3;
        });
    }
}
