package _04_MethodReference;

/*
 * 参考: https://www.jianshu.com/p/62465b26818f
 *
 * 类的任意对象的实例方法引用:
 * 类的任意对象的实例方法引用的语法格式为:
 *     类名::实例方法名
 * 如:
 *     Arrays.sort(strs, String::compareToIgnoreCase);
 *     等价于lambda表达式
 *     Arrays.sort(strs, (s1, s2) -> s1.compareToIgnoreCase(s2));
 * 上述示例中, strs为一个String数组, lambda表达式(s1,s2)->s1.compareToIgnoreCase(s2)实现的是Comparator接口,
 * Comparator接口中的方法定义为:
 *     int compare(T o1, T o2);
 * 而String类的compareToIgnoreCase方法源码为:
 *     public int compareToIgnoreCase(String str) {
 *         return CASE_INSENSITIVE_ORDER.compare(this, str);
 *     }
 * 可以发现函数式接口Comparator<String>的compare方法比String类的compareToIgnoreCase方法多了一个String类型的入参;
 * 但是, 我们在Usage1.java中讲过, "方法引用所使用方法的入参和返回值与lambda表达式实现的函数式接口的入参和返回值一致",
 * 这是怎么回事呢? 请看第二个例子(详见下方代码);
 *
 * 看完上述例子, 我们可以总结出类的任意对象的实例方法引用的特性为:
 * 1. 方法引用的通用特性:
 *    方法引用所使用方法的入参和返回值与lambda表达式实现的函数式接口的入参和返回值一致;
 * 2. lambda表达式的第一个入参为实例方法的调用者, 后面的入参与实例方法的入参一致;
 */

import java.util.Arrays;

class Student {
    private String name;
    private Integer score;

    public void setNameAndScore(String name, Integer score) {
        this.name = name;
        this.score = score;
        System.out.println("Student " + name + "'s score is " + score);
    }
}

@FunctionalInterface
interface TestInterface {
    // 注意: 入参比Student类的setNameAndScore方法多1个Student对象, 除第一个外其它入参类型一致
    void set(Student s, String name, Integer score);
}

public class Usage4 {
    public static void case1() {
        String[] strs = {"c", "b", "a"};
        System.out.println("Before sort: " + Arrays.toString(strs));
        Arrays.sort(strs, String::compareToIgnoreCase);
        System.out.println("After sort: " + Arrays.toString(strs));
    }

    public static void case2() {
        // lambda表达式的写法
        TestInterface testInterface1 = (student, name, score) -> student.setNameAndScore(name, score);
        testInterface1.set(new Student(), "深海的星星", 20);

        // 类的任意对象的实例方法引用的写法
        TestInterface testInterface2 = Student::setNameAndScore;
        testInterface2.set(new Student(), "毛毛的大脚", 49);
    }

    public static void main(String[] args) {
        // case1();
        case2();
    }
}
