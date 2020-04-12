package _04_MethodReference;

/*
 * 参考: https://www.jianshu.com/p/62465b26818f
 *
 * 特定对象的实例方法引用:
 * 特定对象的实例方法引用的语法格式为:
 *     对象::实例方法名
 * 详见下方示例;
 * 特定对象的实例方法引用适用于lambda表达式的主体中仅仅调用了某个对象的某个实例方法的场景;
 */

import java.util.stream.Stream;

public class Usage5 {
    public void println(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Usage5 instance = new Usage5();

        // lambda表达式的写法
        Stream.of("a", "c", "b").sorted(String::compareToIgnoreCase).forEach(s -> instance.println(s));

        System.out.println("==================");

        // 特定对象的实例方法引用的写法
        Stream.of("a", "c", "b").sorted(String::compareToIgnoreCase).forEach(instance::println);
    }
}
