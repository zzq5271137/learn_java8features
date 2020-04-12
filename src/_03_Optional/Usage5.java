package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * filter()方法:
 * filter()方法接受参数为Predicate(函数式接口)对象, 用于对Optional对象进行过滤, 如果符合Predicate的条件,
 * 返回Optional对象本身, 否则返回一个空的Optional对象;
 *
 * 下面示例中, 实现了年龄大于18的学生的筛选;
 */

import java.util.Optional;

class Student4 {
    private int age;

    public Student4(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Usage5 {
    public static void filterAge(Student4 student) {
        Optional.ofNullable(student).filter(u -> u.getAge() > 18).ifPresent(u -> System.out.println("成年了"));
    }

    public static void main(String[] args) {
        filterAge(new Student4(20));
        filterAge(new Student4(17));
    }
}
