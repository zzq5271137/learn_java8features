package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * filter()方法:
 * filter()方法的参数为Predicate(函数式接口)对象, 在lambda表达式的讲解中我们提到过这个接口, 一般用它进行过滤;
 *
 * 在这个例子中, 使用filter()方法过滤出集合中的自然数(大于0的正整数);
 */

import java.util.Arrays;
import java.util.List;

public class Usage6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, -2, 0, 4, 5);
        long count = numbers.parallelStream().filter(n -> n > 0).count();
        System.out.println("Positive count: " + count);
    }
}
