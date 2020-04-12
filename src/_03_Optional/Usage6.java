package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * map()方法:
 * map()方法的参数为Function(函数式接口)对象, map()方法将Optional中的包装对象用Function函数进行运算,
 * 并包装成新的Optional对象(包装对象的类型可能改变);
 *
 * 下面代码中, 先用ofNullable()方法构造一个Optional<Student>对象, 然后用map()计算学生的年龄,
 * 返回Optional<Integer>对象(如果student为null, map()方法返回一个空的Optinal对象);
 */

import java.util.Optional;

class Student5 {
    private int age;

    public Student5(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Usage6 {
    public static Optional<Integer> getAge(Student5 student) {
        return Optional.ofNullable(student).map(Student5::getAge);
    }

    public static void main(String[] args) {
        getAge(null).ifPresent(System.out::println);
        getAge(new Student5(10)).ifPresent(System.out::println);
    }
}
