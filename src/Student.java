import org.jetbrains.annotations.NotNull;

public class Student extends Person implements Comparable<Student>, Cloneable{

    private double scores;

    @Override
    public void setAge(int age) {
        System.out.println('b');
        super.setAge(100);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if (super.getAge() - o.getAge() != 0)
            return this.getAge() - o.getAge();
        else
            return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                '}';
    }

    @Override
    public void a() {

    }


    public void b() {
        System.out.println("here");
    }

    public static void c(){
        System.out.println("Demo中的静态方法");
    }
}
