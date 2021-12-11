package Lambda;

/**
 *   lambda表达式的标准格式:
 *      由三部分组成:
 *         a.一些参数
 *         b.一个箭头
 *         c.一段代码
 *      格式:
 *          (参数列表) -> {重写的方法}
 *      解释格式说明:
 *          (): 接口中抽象方法的参数列表, 没有参数则为空; 若有则写出参数,参数间使用逗号分隔
 *          ->: 将参数传递给方法体
 *          {}: 重写接口中的抽象方法体
 */

public class lambda01 {
    public static void main(String[] args) {
        // 使用匿名内部类
        method(new Cook() {
            @Override
            public void eatLunch() {
                System.out.println("Eat lunch.");
            }
        });

        // 使用lambda表达式
        method(()->{
            System.out.println("Lambda: Eat lunch.");
        });

    }

    public static void method(Cook cook) {
        cook.eatLunch();
    }
}
