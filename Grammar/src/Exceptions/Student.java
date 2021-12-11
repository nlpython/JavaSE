package Exceptions;

public class Student {
    private int age;
    private String name;
    private String sex;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) throws Exception {
        if (sex.equals("Man") || sex.equals("Woman")) {
            this.sex = sex;
        } else {
            // 1.抛出运行时异常
//            throw new RuntimeException("性别设置错误");
            // 2.抛出检查异常
            throw new Exception("性别设置错误");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
