package Dsce;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *  延迟方法: 返回值依旧是Stream接口自身类型的方法, 因此支持链式调用.(除终结方法外, 其余都是延迟方法)
 *  终结方法: 返回值不再是Stream接口, 终结方法主要有 count, forEach
 *
 *  forEach, filter, map, count, limit, skip, contact
 */

public class used {
    @Test
    public void testForEach() {
        // 获取Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
        // 使用Stream流中的方法forEach对Stream流中的数据进行遍历
//        stream.forEach((String name)->{
//            System.out.println(name);
//        });
        // 简化后
        stream.forEach(name-> System.out.println(name));
    }

    @Test
    public void testFilter() {
        // 获取Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "张三丰");
        // 对Stream流的数据进行过滤
//        stream.filter((String name)->{
//            return name.startsWith("张");
//        }).forEach(name-> System.out.println(name));
        stream.filter(name->name.startsWith("张")).forEach(name-> System.out.println(name));
        /**
         *  Stream流属于管道流, 只能被消费一次.
         *  第一个Stream流调用完毕方法, 数据就会流转到下一个Stream上
         *  而这时第一个Stream流已经使用完毕, 就会关闭了
         *  所以第一个Stream流就不能再调用方法了
         */
    }

    @Test
    public void testMap() {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        // 使用map方法, 把字符串类型的整数, 映射(转换)为Integer类型的整数
//        stream.map((String s)->{
//            return Integer.valueOf(s);
//        }).forEach(name-> System.out.println(name));
        stream.map(s->Integer.valueOf(s)).forEach(s-> System.out.println(s));
    }

    @Test
    public void testCount() {
        // 返回long类型, 为终结方法
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }

    @Test
    public void testLimit() {
        // 获取一个Stream流
        String[] arr = {"Jill", "Paul", "Mike", "Eric"};
        Stream<String> stream = Stream.of(arr);
        // 使用limit方法对流进行截取, 只要前3个元素
        Stream<String> stream2 = stream.limit(3);
        stream2.forEach(s-> System.out.println(s));
    }

    @Test
    public void testSkip() {
        // 跳过前几个元素
        String[] arr = {"Jill", "Paul", "Mike", "Eric"};
        Stream<String> stream = Stream.of(arr);
        stream.skip(2).forEach(s-> System.out.println(s));
    }

    @Test
    public void testContact() {
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream2 = Stream.of("韩信", "张良", "魏延", "赵云");

        // 把以上两个流组合成一个流
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(s-> System.out.println(s));
    }
}
