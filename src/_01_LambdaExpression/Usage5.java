package _01_LambdaExpression;

/*
 * 参考: https://www.jianshu.com/p/8d7f98116693
 *
 * Predicate接口适合用于过滤, 测试对象是否符合某个条件;
 * Predicate接口是一个函数式接口, 待实现的唯一抽象方法是boolean test(T t)方法, 所以可以使用lambda表达式;
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Usage5 {
    public static void filter(List<Integer> numbers, Predicate<Integer> condition) {
        numbers.forEach(n -> {
            if (condition.test(n)) {
                System.out.println("大于0: " + n);
            }
        });
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, -2, 0, 4, 7);

        // 将lambda作为参数传入(和匿名内部类用法一样)
        filter(numbers, n -> n > 0);

        System.out.println("========================");

        // 对于数组的迭代, 还可以使用StreamAPI的方式
        numbers.stream().filter(n -> n > 0).forEach(n -> System.out.println("大于0: " + n));
    }
}
