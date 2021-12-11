package Dsce;

import java.util.*;
import java.util.stream.Stream;

/**
 *  filter, map, skip都是在对函数模型进行操作, 集合元素并没有真正被处理.
 *  只有当终结方法count执行的时候, 整个模型才会按照指定策略执行操作, 这得益于Lambda的延迟实行特性.
 *
 *  "Stream"其实是一个集合元素的函数模型, 它并不是集合, 也不是数据结构,
 *  其本身并不存储任何元素(或其地址)
 *
 *  数据源可以是集合或数组
 */

public class dsce {
    // 获取Stream流
    public static void main(String[] args) {
        // 把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map = new HashMap();
        // 获取键, 存储到set中
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();

        // 获取值, 存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        // 把数组转化为Stream流
        Integer[] arr1 = new Integer[]{1, 2, 3 ,4, 5};
        Stream<Integer> stream6 = Stream.of(arr1);
        String[] arr2 = {"a", "bb", "ccc"};
        Stream<String> stream7 = Stream.of(arr2);
    }
}
