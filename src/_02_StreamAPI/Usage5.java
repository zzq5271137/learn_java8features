package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * flatMap()方法:
 * flatMap()能够将一个二维的集合映射成一个一维的集合, 比map()方法拥有更高的映射深度;
 */

import java.util.Arrays;
import java.util.List;

public class Usage5 {
    public static void main(String[] args) {
        // 其有三个元素, 每个元素有两个数并用空格隔开, 将每个元素以空格分割成2个元素, 并遍历打印这6个元素
        List<String> list = Arrays.asList("1 2", "3 4", "5 6");

        // 使用flatMap()实现
        list.stream().flatMap(item -> Arrays.stream(item.split(" "))).forEach(System.out::println);
        // 使用map()实现
        list.stream().map(item -> Arrays.stream(item.split(" "))).forEach(n -> n.forEach(System.out::println));
    }
}
