package Enum;

public class Student {
    private String Name;
    private int age;
    private Gender sex;

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

enum Gender {
    男,
    女;
}

class test {
    public static void main(String[] args) {
        Student p = new Student();
        p.setAge(19);
        p.setName("Jill");
        p.setSex(Gender.男);  // 只能传入Gender对象
        System.out.println(p);
    }
}
