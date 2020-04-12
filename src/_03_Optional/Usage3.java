package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * isPresent()方法:
 * isPresent()方法用于判断包装对象的值是否非空;
 *
 * 下面这段代码实现的是Intro.java中的逻辑, 但是这种用法不但没有减少null的防御性检查, 而且增加了Optional包装的过程,
 * 违背了Optional设计的初衷, 因此开发中要避免这种糟糕的使用;
 */

import java.util.Optional;

class Student2 {
    private String gender;

    public Student2(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

public class Usage3 {
    public static String getGender(Student2 student) {
        Optional<Student2> stuOpt = Optional.ofNullable(student);
        if (stuOpt.isPresent()) {
            return stuOpt.get().getGender();
        }
        return "Unknown";
    }

    public static void main(String[] args) {
        System.out.println(getGender(null));
    }
}
