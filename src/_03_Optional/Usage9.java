package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * orElseGet()方法:
 * orElseGet()方法与orElse()方法类似, 区别在于orElseGet()方法的入参为一个Supplier(函数式接口)对象,
 * 用Supplier对象的get()方法的返回值作为默认值;
 */

import java.util.Optional;

class Student8 {
    private String name;

    public Student8(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Usage9 {
    public static String getName(Student8 student) {
        return Optional.ofNullable(student).map(Student8::getName).orElseGet(() -> "Unknown");
    }

    public static void main(String[] args) {
        System.out.println(getName(new Student8("毛毛的大脚")));
        System.out.println(getName(null));
    }
}
