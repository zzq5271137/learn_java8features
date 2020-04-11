package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * Stream API简介:
 * java8新添加了一个特性: 流Stream; Stream让开发者能够以一种声明的方式处理数据源(集合、数组等),
 * 它专注于对数据源进行各种高效的聚合操作(aggregate operation)和大批量数据操作(bulk data operation);
 * Stream API将处理的数据源看做一种Stream(流), Stream(流)在Pipeline(管道)中传输和运算,
 * 支持的运算包含筛选、排序、聚合等, 当到达终点后便得到最终的处理结果;
 *
 * 几个关键概念:
 * 1. 元素
 *    Stream是一个来自数据源的元素队列, Stream本身并不存储元素;
 * 2. 数据源(即Stream的来源)
 *    包含集合、数组、I/O channel、generator(发生器)等;
 * 3. 聚合操作
 *    类似SQL中的filter、map、find、match、sorted等操作;
 * 4. 管道运算
 *    Stream在Pipeline中运算后返回Stream对象本身, 这样多个操作串联成一个Pipeline, 并形成fluent风格的代码;
 *    这种方式可以优化操作, 如延迟执行(laziness)和短路(short-circuiting);
 * 5. 内部迭代
 *    不同于java8以前对集合的遍历方式(外部迭代), Stream API采用访问者模式(Visitor)实现了内部迭代;
 * 6. 并行运算
 *    Stream API支持串行(stream()方法)或并行(parallelStream()方法)的两种操作方式;
 *
 * Stream API的特点:
 * 1. Stream API的使用和同样是java8新特性的lambda表达式密不可分, 可以大大提高编码效率和代码可读性;
 * 2. Stream API提供串行和并行两种操作, 其中并行操作能发挥多核处理器的优势, 使用fork/join的方式进行并行操作以提高运行速度;
 * 3. Stream API进行并行操作无需编写多线程代码即可写出高效的并发程序, 且通常可避免多线程代码出错的问题;
 *
 * 详细介绍:
 * 1. 简单示例
 *    详见Usage1.java
 * 2. 典型接口详解
 *    a). Stream的生成
 *        详见Usage2.java
 *    b). forEach()方法
 *        详见Usage3.java
 *    c). map()方法
 *        详见Usage4.java
 *    d). flatMap()方法
 *        详见Usage5.java
 *    e). filter()方法
 *        详见Usage6.java
 *    f). reduce()方法
 *        详见Usage7.java
 *    g). collect()方法
 *        详见Usage8.java
 *    h). summaryStatistics()方法进行数值统计
 *        详见Usage9.java
 *    i). 其他方法
 *        详见Usage10.java
 *    j). 注意事项
 *        详见Usage11.java
 */

public class Intro {
    public static void main(String[] args) {
    }
}
