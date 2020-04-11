package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * map()方法:
 * map()方法的参数为Function(函数式接口)对象, map()方法将流中的所有元素用Function对象进行运算,
 * 生成新的流对象(流的元素类型可能改变);
 *
 * 在这个例子中, 用map()方法计算了所有数组元素的绝对值并生成了一个新的流, 然后再用forEach()遍历打印;
 */

import java.util.Arrays;
import java.util.List;

public class Usage4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-3, -4, 0, 7, 1);
        numbers.stream().map(Math::abs).forEach(n -> System.out.println("Element abs: " + n));
    }
}
