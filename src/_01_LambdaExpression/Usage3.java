package _01_LambdaExpression;

/*
 * 参考: https://www.jianshu.com/p/8d7f98116693
 *
 * List迭代的lambda实现:
 * java8中, 集合类的顶层接口java.lang.Iterable定义了一个forEach方法, forEach方法可以迭代集合的所有对象,
 * 其参数为Consumer对象, Consumer类位于java.util.function包下, 它是一个函数式接口, 所以可以使用lambda表达式;
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.print(integer + " ");
    }
}

public class Usage3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);

        System.out.println("自己实现Consumer接口的方式:");
        MyConsumer myConsumer = new MyConsumer();
        integers.forEach(myConsumer);

        System.out.println();

        System.out.println("匿名内部类的方式:");
        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        });

        System.out.println();

        System.out.println("lambda表达式的方式:");
        integers.forEach(n -> {
            System.out.print(n + " ");
        });

        System.out.println();
    }
}
