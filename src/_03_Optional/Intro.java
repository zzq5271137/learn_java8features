package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * Optional类是Java8为了解决null值判断问题, 借鉴google guava类库的Optional类而引入的一个同名Optional类,
 * 使用Optional类可以避免显式的null值判断(null的防御性检查), 避免null导致的NPE(NullPointerException);
 * 下方代码是对Optional的简单使用;
 *
 * 详细介绍:
 * 1. Optional对象的创建
 *    详见Usage1.java
 * 2. Optional类典型接口的使用
 *    a). get()方法
 *        详见Usage2.java
 *    b). isPresent()方法
 *        详见Usage3.java
 *    c). ifPresent()方法
 *        详见Usage4.java
 *    d). filter()方法
 *        详见Usage5.java
 *    e). map()方法
 *        详见Usage6.java
 *    f). flatMap()方法
 *        详见Usage7.java
 *    g). orElse()方法
 *        详见Usage8.java
 *    h). orElseGet()方法
 *        详见Usage9.java
 *    i). orElseThrow()方法
 *        详见Usage10.java
 * 3. 注意事项:
 *    使用Optional开发时要注意正确使用Optional的"姿势", 特别注意不要使用Usage3.java中提到的错误示范,
 *    谨慎使用isPresent()和get()方法, 尽量多使用map()、filter()、orElse()等方法来发挥Optional的作用;
 */

import java.util.Optional;

class Student {
    private String gender;

    public Student(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}

public class Intro {
    // 为了防止student对象为null, 显式地做了防御性检查: 如果值为null, 返回"Unkown"
    public static String getGender1(Student student) {
        if (null == student) {
            return "Unknown";
        }
        return student.getGender();
    }

    // 使用Optional, 避免显式的null值防御性检查
    public static String getGender2(Student student) {
        return Optional.ofNullable(student).map(Student::getGender).orElse("Unknown");
    }

    public static void main(String[] args) {
        System.out.println(getGender1(null));
        System.out.println(getGender2(null));
    }
}
