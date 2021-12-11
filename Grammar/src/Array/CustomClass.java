package Array;

import java.util.Arrays;

public class CustomClass {
    public static void main(String[] args) {
        Student[] s = new Student[3];
        s[0] = new Student(20, 88.3, "Paul");
        s[1] = new Student(20, 76.5, "Jill");
        s[2] = new Student(18, 92.7, "Amy");
        Arrays.sort(s);
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }
    }
}

class Student implements Comparable<Student> {
    private int ages;
    private double scores;
    private String name;

    public Student(int ages, double scores, String name) {
        this.ages = ages;
        this.scores = scores;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ages=" + ages +
                ", scores=" + scores +
                ", name='" + name + '\'' +
                '}';
    }

    // 只有实现Comparable接口,Student类才能进行比较和排序
    @Override
    public int compareTo(Student o) {
        // 按年龄进行主排序,名字作为副排序
        if (this.ages > o.ages) {
            return 1;
        } else if (this.ages == o.ages) {
            return this.name.compareTo(o.name);
        } else {
            return -1;
        }
    }
}
