package _01_LambdaExpression;

/*
 * 参考: https://www.jianshu.com/p/8d7f98116693
 *      https://www.jianshu.com/p/a01d84c57180
 *
 * 函数式接口:
 * 函数式接口(Functional Interface)是java8新增的特性, 它是一个有且仅有一个抽象方法, 但是可以有多个非抽象方法的接口,
 * 函数式接口可以有任意的default或着static方法; 函数式接口可以被隐式转换为lambda表达式;
 * 函数式接口的概念实际上是一种规范, 当声明函数式接口时, @FunctionalInterface注解可以被加上; 这个注解其实没有实际的作用,
 * 当你按照函数式接口的规范写了一个接口时, 不加上这个注解也依然可以使用lambda表达式; 虽然@FunctionalInterface没有明确的作用,
 * 但是如果这个注解被加在了一个不满足函数式规范的接口上, 就会产生compiler error, 因此这个注解充当一个提醒者的角色;
 *
 * Java中的函数式接口:
 * Runnable接口是在JDK1.8之前已经存在的接口, 在JDK1.8中加入了@FunctionalInterface注解, 表示将其定义为一个函数式接口;
 * 在JDK1.8中定义的函数式接口还有:
 * 1). java.util.concurrent.Callable
 * 2). java.security.PrivilegedAction
 * 3). java.util.Comparator
 * 4). java.io.FileFilter
 * 5). java.nio.file.PathMatcher
 * 6). java.lang.reflect.InvocationHandler
 * 7). java.beans.PropertyChangeListener
 * 8). java.awt.event.ActionListener
 * 9). javax.swing.event.ChangeListener
 * JDK1.8新增加的函数式接口有java.util.function包下的接口, 典型的如上一节中提到的Consumer接口, 还有其他很多接口;
 * 到这里, 可以总结出, java8中用lambda表达式代替匿名内部类, 本质上是将接口定义为函数式接口, 并将函数式接口隐式转换为lambda表达式;
 */

public class Usage4 {
    public static void main(String[] args) {
    }
}
