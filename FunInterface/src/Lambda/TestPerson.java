package Lambda;

import java.util.Arrays;

public class TestPerson {
    public static void main(String[] args) {
        // 使用数组存储多个Person对象
        Person[] arr = {
                new Person(18, "Jill"),
                new Person(21, "Paul"),
                new Person(19, "Amy")
        };

        // 对数组中的对象按age升序进行排序
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // 使用Lambda, 简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        System.out.println(Arrays.toString(arr));
    }
}
