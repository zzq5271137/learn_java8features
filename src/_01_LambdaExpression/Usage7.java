package _01_LambdaExpression;

/*
 * 参考: https://www.jianshu.com/p/8d7f98116693
 *
 * 注意事项:
 * 1. lambda表达式可以使用方法引用(Method Reference), 当且仅当主体中不修改lambda表达式提供的参数, 如:
 *        numbers.forEach(n -> System.out.println(n));
 *        等价于
 *        numbers.forEach(System.out::println);
 *    而如果对参数有任何修改时不能使用方法引用, 如:
 *        numbers.forEach(n -> System.out.println(n + 1));
 * 2. lambda与匿名类的联系和区别:
 *    联系:
 *         1). 都可以访问final或effectively final局部变量;
 *         2). 生成的对象都可以调用实现的接口方法;
 *    区别:
 *         1). this指针的指向不同:
 *             我们知道匿名类的this指针指向匿名类, 而lambda表达式的this指针指向的是包围lambda表达式的类;
 *         2). 编译方式不同:
 *             lambda在编译器内部被翻译为私有方法, 并使用了Java 7的invokedynamic字节码指令来动态绑定这个方法;
 *         3). 实现的接口限制有区别:
 *             匿名类可以为任意接口创建实例, 只要实现接口所有的抽象方法即可;
 *             而lambda表达式只能实现函数式接口(只有一个必须实现的抽象方法的接口);
 *         4). 接口默认方法的调用权限不同:
 *             匿名类实现的抽象方法允许调用接口中的默认方法(default方法), 而lambda表达式不能调用接口中的默认方法;
 */

import java.util.function.Predicate;

public class Usage7 {
    public void differentThis(Usage7 instance) {
        Predicate<Integer> p1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("匿名内部类中的this指向: " + this);
                return integer > 0;
            }
        };
        System.out.println("匿名内部类创建的对象地址: " + p1);
        p1.test(7);

        Predicate<Integer> p2 = integer -> {
            System.out.println("labmda表达式中的this指向: " + this);
            return integer > 0;
        };
        System.out.println("lambda表达式创建的对象地址: " + p2);
        p2.test(7);

        System.out.println("Usage7对象的地址: " + instance);
    }

    public static void main(String[] args) {
        Usage7 instance = new Usage7();
        instance.differentThis(instance);
    }
}
