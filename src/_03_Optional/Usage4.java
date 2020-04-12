package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * ifPresent()方法:
 * ifPresent()方法接受一个Consumer对象(消费函数), 如果包装对象的值非空, 运行Consumer对象的accept()方法;
 * 如果包装对象的值是空, 那就不执行Consumer对象的accept()方法;
 *
 * 下方例子中, 由于ifPresent()方法内部做了null值检查, 所以调用前无需担心NPE(NullPointerException)问题;
 */

import java.util.Optional;

class Student3 {
    private String name;

    public Student3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Usage4 {
    public static void printName(Student3 student) {
        Optional.ofNullable(student).ifPresent(s -> System.out.println(s.getName()));
    }

    public static void main(String[] args) {
        printName(new Student3("毛毛的大脚"));
        printName(null);
    }
}
