package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * 注意事项:
 * Stream中的操作从概念上讲分为中间操作和终端操作:
 * 1. 中间操作:
 *    例如peek()方法提供Consumer(消费)函数, 但执行peek()方法时不会执行Consumer函数,
 *    而是等到流真正被消费时(终端操作时才进行消费)才会执行, 这种操作为中间操作;
 * 2. 终端操作:
 *    例如forEach()、collect()、count()等方法会对流中的元素进行消费,
 *    并执行指定的消费函数(peek方法提供的消费函数在此时执行), 这种操作为终端操作;
 * 要理解中间操作和终端操作的概念;
 */

public class Usage11 {
    public static void main(String[] args) {
    }
}
