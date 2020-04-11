package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * Stream的生成:
 * java8的Stream API支持串行或并行的方式; 可以简单看下jdk1.8 Collection接口的源码;
 * 可以看出, 在集合类的接口(Collection)中, 分别用两种方式来生成流:
 * 1. 串行流: stream()
 * 2. 并行流: parallelStream()
 * 应该注意的是, 使用parallelStream()生成并行流后, 对集合元素的遍历是无序的;
 */

public class Usage2 {
    public static void main(String[] args) {
    }
}
