package _04_MethodReference;

/*
 * 参考: https://www.jianshu.com/p/62465b26818f
 *
 * 方法引用(Method Reference)是java8的新特性之一, 可以直接引用已有Java类或对象的方法或构造器;
 * 方法引用与lambda表达式结合使用, 可以进一步简化代码;
 * 简单示例请看下方代码;
 *
 * 详细介绍:
 * 1. 方法引用的具体使用
 *    a). 方法引用的规则
 *        详见Usage1.java
 *    b). 静态方法引用
 *        详见Usage2.java
 *    c). 构造器引用
 *        详见Usage3.java
 *    d). 类的任意对象的实例方法引用
 *        详见Usage4.java
 *    e). 特定对象的实例方法引用
 *        详见Usage5.java
 * 2. 总结
 *    详见Usage6.java
 */

import java.util.Arrays;
import java.util.List;

public class Intro {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "c", "b");

        /*
         * 此处生成一个Stream流, 对流中的字符串进行排序并遍历打印; 程序中采用lambda表达式的方式代替匿名类简化了代码,
         * 然而代码中两处lambda表达式都仅仅调用的是一个已存在的方法:
         * String.compareToIgnoreCase、System.out.println,
         * 这种情况可以用方法引用来简化;
         */
        strList.stream().sorted((s1, s2) -> s1.compareToIgnoreCase(s2)).forEach(s -> System.out.println(s));

        /*
         * 此处分别采用了类的任意对象的实例方法引用和特定对象的实例方法引用两种方法引用形式,
         * 采用方法引用的方式可以简化lambda表达式的写法;
         */
        strList.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);
    }
}
