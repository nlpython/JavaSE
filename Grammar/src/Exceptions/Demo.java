package Exceptions;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Jill");
        s1.setAge(19);

        try {
            s1.setSex("Mn");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(s1);
    }
}
