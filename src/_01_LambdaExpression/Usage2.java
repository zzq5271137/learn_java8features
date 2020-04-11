package _01_LambdaExpression;

/*
 * 参考: https://www.jianshu.com/p/8d7f98116693
 *
 * Runnable接口的lambda实现;
 */

public class Usage2 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("hello world")).start();
    }
}
