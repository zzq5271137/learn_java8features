package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * reduce()方法:
 * reduce操作又称为折叠操作, 用于将流中的所有值合成一个;
 * reduce()方法参数为BinaryOperator类型的累加器(它接受两个类型相同的参数, 返回值类型跟参数类型相同), 返回一个Optional对象;
 * 实际上, Stream API中的mapToInt()方法返回的IntStream接口有类似的average()、count()、sum()等方法就是做reduce操作,
 * 类似的还有mapToLong()、mapToDouble()方法; 当然, 我们也可以用reduce()方法来自定义reduce操作;
 *
 * 在这个例子中, 利用reduce()方法结合lambda表达式实现数组的求和功能;
 */

import java.util.Arrays;
import java.util.List;

public class Usage7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, -2, 0, -1, 4, 5, 1);
        Integer total = numbers.stream().reduce(Integer::sum).get();
        System.out.println("Total: " + total);
    }
}
