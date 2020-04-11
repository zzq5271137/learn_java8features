package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * summaryStatistics()方法进行数值统计:
 * 其实summaryStatistics()方法并不是Stream接口的方法, 而是Stream API采用mapToInt()、mapToLong()、mapToDouble()三个方法,
 * 分别生成IntStream、LongStream、DoubleStream三个接口类型的对象,
 * 这3个方法的参数分别为3个函数式接口ToIntFunction、ToLongFunction、ToDoubleFunction,
 * 使用时可以用lambda表达式计算返回对应的int、long、double类型即可;
 * IntStream、LongStream、DoubleStream三个接口类型都有一个summaryStatistics()方法,
 * 分别返回IntSummaryStatistics、LongSummaryStatistics、DoubleSummaryStatistics;
 * 在IntSummaryStatistics、LongSummaryStatistics、DoubleSummaryStatistics三个接口类型(位于java.util包下)中,
 * 都有诸如统计数量、最大值、最小值、求和、平均值等方法(方法名和返回类型可能不同), 利用这些方法我们可以方便的进行数值统计;
 */

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Usage9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, -2, 0, 4, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Max : " + stats.getMax());
        System.out.println("Min : " + stats.getMin());
        System.out.println("Sum : " + stats.getSum());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Count : " + stats.getCount());
    }
}
