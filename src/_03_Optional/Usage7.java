package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * flatMap()方法:
 * 跟map()方法不同的是, 入参Function函数的返回值类型为Optional<U>类型, 而不是U类型,
 * 这样flatMap()能将一个二维的Optional对象映射成一个一维的对象;
 */

import java.util.Optional;

class Student6 {
    private int age;

    public Student6(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Usage7 {
    public static Optional<Integer> getAge(Student6 student) {
        return Optional.ofNullable(student).flatMap(u -> Optional.ofNullable(u.getAge()));
    }

    public static void main(String[] args) {
        getAge(null).ifPresent(System.out::println);
        getAge(new Student6(10)).ifPresent(System.out::println);
    }
}
