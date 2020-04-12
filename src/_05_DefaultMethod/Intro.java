package _05_DefaultMethod;

/*
 * 参考: https://www.jianshu.com/p/a58b6f5b0c54
 *
 * 默认方法是指接口的默认方法, 它是java8的新特性之一; 顾名思义, 默认方法就是接口提供一个默认实现,
 * 且不强制实现类去覆写的方法; 默认方法用default关键字来修饰;
 *
 * 默认方法可以解决的痛点:
 * 在java8之前, 修改接口功能通常会给接口添加新的方法, 这时对已经实现该接口的所有实现类, 都要一一添加对新方法的实现;
 * 换言之, 在给接口定义新方法的同时无法不影响到已有的实现类, 这时, java8的默认方法特性就可以解决这种接口修改与已有实现类不兼容的问题;
 *
 * 默认方法的使用:
 * 1. 一个类实现多个接口, 接口中有相同默认方法的解决
 *    注意: 当一个类实现多个接口时, 若多个接口中存在相同默认方法(方法名、参数、返回值相同), 此时实现类必须要覆写默认方法;
 *    覆写有两种方式：
 *    a). 实现类自己实现方法逻辑;
 *    b). 采用super关键字来调用指定接口的默认方法, 如下方代码;
 * 2. 接口静态方法
 *    java8支持接口中定义静态方法(需要提供默认实现), 写法上将默认方法的default关键字换成static关键字即可;
 *    顾名思义, 接口的静态方法直接可以使用接口名去调用, 而不需要对象去调用; 如下方代码;
 */

interface TestInterface1 {
    default void testDefault() {
        System.out.println("TestInterface1");
    }
}

interface TestInterface2 {
    default void testDefault() {
        System.out.println("TestInterface2");
    }
}

interface TestInterface3 {
    static void testStatic() {
        System.out.println("TestInterface3");
    }
}

public class Intro implements TestInterface1, TestInterface2 {
    @Override
    public void testDefault() {
        // 调用TestInterface1接口的默认testDefault()方法
        TestInterface1.super.testDefault();
    }

    public static void main(String[] args) {
        new Intro().testDefault();
        TestInterface3.testStatic();
    }
}
