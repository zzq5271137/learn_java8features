package _02_StreamAPI;

/*
 * 参考: https://www.jianshu.com/p/2b40fd0765c3
 *
 * collect()方法:
 * collect()方法的参数为一个java.util.stream.Collector类型对象,
 * 可以用java.util.stream.Collectors工具类提供的静态方法来生成,
 * Collectors类实现很多的归约操作,
 * 如Collectors.toList()、Collectors.toSet()、Collectors.joining()(joining适用于字符串流)等;
 *
 * 在这个例子中, 用map()方法生成新的流, 再用collect()方法返回原数组的绝对值数组;
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Usage8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, -2, 0, 4, 5);
        List<Integer> abss = numbers.stream().map(Math::abs).collect(Collectors.toList());
        System.out.println("Abs list: " + abss);
    }
}
