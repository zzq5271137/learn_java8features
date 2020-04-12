package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * orElseThrow()方法:
 * orElseThrow()方法其实与orElseGet()方法非常相似了, 入参都是Supplier对象,
 * 只不过orElseThrow()的Supplier对象必须返回一个Throwable异常, 并在orElseThrow()中将异常抛出;
 */

import java.util.Optional;

class Student9 {
    private String name;

    public Student9(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class NullStudentException extends RuntimeException {
    public NullStudentException() {
        super("The Student instance is null...");
    }
}

public class Usage10 {
    public static String getName(Student9 student) {
        return Optional.ofNullable(student).map(Student9::getName).orElseThrow(NullStudentException::new);
    }

    public static void main(String[] args) {
        System.out.println(getName(new Student9("毛毛的大脚")));
        System.out.println(getName(null));
    }
}
