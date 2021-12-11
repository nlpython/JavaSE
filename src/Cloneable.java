public interface  Cloneable{
    //常量：
    public static final int NUM = 10;
    //抽象方法：
    public abstract  void a();
    //public default非抽象方法；
    public default void b(){
        System.out.println("-----TestInterface2---b");
    }
    //静态方法：
    public static void c(){
        System.out.println("TestInterface2中的静态方法");
    }
}