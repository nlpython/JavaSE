package Params;

public class VarParams {
    // 可变参数
    /* 编写一个函数addAll(),实现如下操作
       addAll(1, 5)
       addAll(1, 3, 4)
       addAll(3, 8, 5)
       .....
    */
    public static void main(String[] args) {
        System.out.println(addAll(1, 3, 4, 5));
        System.out.println(addAll(new int[]{1, 3, 9, 4}));
    }

    // 可变参数的本质就是数组
    public static int addAll(int ... param) {
       int result = 0;
       for (int i = 0; i < param.length; i++) {
           result += param[i];
       }
       return result;
    }
}
