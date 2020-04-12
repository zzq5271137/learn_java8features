package _04_MethodReference;

/*
 * 参考: https://www.jianshu.com/p/62465b26818f
 *
 * 静态方法引用:
 * 静态方法引用的语法格式为:
 *     类名::静态方法名
 * 如:
 *     System.out::println
 *     等价于lambda表达式
 *     s -> System.out.println(s)
 * 静态方法引用适用于lambda表达式主体中仅仅调用了某个类的静态方法的情形;
 */

import java.util.Arrays;

public class Usage2 {
    public static void println(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // 使用lambda表达式
        Arrays.asList("a", "c", "b").forEach(s -> Usage2.println(s));

        System.out.println("===================");

        // 使用静态方法引用
        Arrays.asList("a", "c", "b").forEach(Usage2::println);
    }
}
