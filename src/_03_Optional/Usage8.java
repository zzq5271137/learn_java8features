package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * orElse()方法:
 * orElse()方法功能比较简单, 即如果包装对象值非空, 返回包装对象值, 否则返回入参other的值(默认值);
 */

import java.util.Optional;

class Student7 {
    private String name;

    public Student7(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Usage8 {
    public static String getName(Student7 student) {
        return Optional.ofNullable(student).map(Student7::getName).orElse("Unknown");
    }

    public static void main(String[] args) {
        System.out.println(getName(new Student7("毛毛的大脚")));
        System.out.println(getName(null));
    }
}
