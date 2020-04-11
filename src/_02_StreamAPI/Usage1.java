package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * 简单示例:
 * 使用Steam API, 统计整数集合中正数的个数;
 *
 * 上这个例子中, 使用filter()方法对数组进行了过滤, 使用count()方法对过滤后的数组进行了大小统计,
 * 且使parallelStream()方法为集合创建了并行流, 自动采用并行运算提高速度;
 * 在更复杂的场景, 还可以用forEach()、map()、limit()、sorted()、collect()等方法进行进一步的流运算;
 */

import java.util.Arrays;
import java.util.List;

public class Usage1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-2, -1, 0, 1, 2);
        long count = numbers.parallelStream().filter(n -> n > 0).count();
        System.out.println("正数的个数: " + count);
    }
}
