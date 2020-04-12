package _03_Optional;

/*
 * 参考: https://www.jianshu.com/p/d81a5f7c9c4e
 *
 * Optional对象的创建:
 * 通过观察Optional的源码我们可以发现, Optional类的两个构造方法都是private型的,
 * 因此类外部不能显示的使用new Optional()的方式来创建Optional对象,
 * 但是Optional类提供了三个静态方法empty()、of(T value)、ofNullable(T value)来创建Optinal对象:
 * 详细例子请看下方代码;
 */

import java.util.Optional;

public class Usage1 {
    public static void main(String[] args) {
        // 1. 创建一个包装对象值为空的Optional对象
        Optional<String> strOpt1 = Optional.empty();

        // 2. 创建一个包装对象值为非空的Optional对象
        Optional<String> strOpt2 = Optional.of("option");

        // 3. 创建一个包装对象值允许为空的Optional对象
        Optional<String> strOpt3 = Optional.ofNullable(null);
    }
}
