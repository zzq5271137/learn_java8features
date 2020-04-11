package _01_LambdaExpression;

/*
 * 参考: https://www.jianshu.com/p/8d7f98116693
 *
 * Runnable接口的lambda实现:
 * 用lambda表达式代替匿名类是java8中lambda的常用形式; 用lambda表达式代替匿名类的关键在于,
 * 匿名类实现的接口使用了java.lang.FunctionalInterface注解, 且只有一个待实现的抽象接口方法, 如Runnable接口;
 * (其实该接口不一定要有@FunctionalInterface注解, 它只需要是一个满足函数式接口规范的接口即可)
 */

public class Usage2 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("hello world")).start();
    }
}
