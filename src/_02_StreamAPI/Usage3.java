package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * forEach()方法:
 * forEach()方法的参数为一个Consumer(消费函数, 一个函数式接口)对象, forEach()方法用来迭代流中的每一个数据;
 * ps: 集合的顶层接口Iterable中也有forEach方法, 可以直接对数组元素进行遍历;
 *
 * 在这个例子中, 对数组的每个元素进行串行遍历, 并打印每个元素的值;
 */

import java.util.Arrays;
import java.util.List;

public class Usage3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, -4, 0, 7, 1);

        // 使用流中的foreach()方法对集合进行遍历
        numbers.stream().forEach(n -> System.out.println("List element: " + n));

        System.out.println("======================");

        // 也可以直接使用foreach()方法(Iterable接口中的foreach()方法)
        numbers.forEach(n -> System.out.println("List element: " + n));
    }
}
