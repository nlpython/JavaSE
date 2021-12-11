package Reflect;

public class Student extends Person implements MyInterface {
    // 属性
    private int sno; //学号
    double height;
    protected double weight;
    public double score;

    // 方法
    public String shouInfo() {
        return "我是一名三好学生";
    }
    private void work() {
        System.out.println("好好工作");
    }
    protected int getSno() {
        return sno;
    }
    public int showInfo(int a, double b) {
        System.out.println("Called showInfo.");
        return 0;
    }
    public void showInfo(int a) {}

    // 构造器
    public Student() {}

    private Student(int sno) {
        this.sno = sno;
    }

    Student(int sno, double weight) {
        this.sno = sno;
        this.weight = weight;
    }

    @Override
    public void MyMethod() {
        System.out.println("重写了接口方法");
    }

    public Student(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}
