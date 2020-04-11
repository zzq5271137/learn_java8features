package _01_LambdaExpression;

/*
 * 参考: https://www.jianshu.com/p/8d7f98116693
 *
 * Predicate接口有三个default关键字定义的方法, 分别为and()、negate()、or()三个方法,
 * 顾名思义, 它们类似于逻辑操作&&、!、||, 用于生成新的Predicate对象;
 *
 * 演示用and()操作过滤大于-1且小于5的数字;
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Usage6 {
    public static void filter(List<Integer> numbers, Predicate<Integer> first, Predicate<Integer> second) {
        numbers.forEach(n -> {
            if (first.and(second).test(n)) {
                System.out.println("大于-1且小于5: " + n);
            }
        });
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-9, -7, -1, 0, 1, 2, 3, 9, 10);
        filter(numbers, n -> n > -1, n -> n < 5);
    }
}
