package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * get()方法:
 * get()方法主要用于返回包装对象的实际值, 但是如果包装对象值为null, 会抛出NoSuchElementException异常;
 */

import java.util.Optional;

public class Usage2 {
    public static void main(String[] args) {
        Student student = new Student("Male");
        Optional<Student> stuOpt = Optional.of(student);
        Student student1 = stuOpt.get();
        System.out.println(student);
        System.out.println(student1);  // 和原对象是同一个对象, 地址相同
    }
}
