package _01_LambdaExpression;

/*
 * 参考: https://www.jianshu.com/p/8d7f98116693
 *
 * lambda的基本语法:
 *     (parameters) -> expression
 *     or
 *     (parameters) -> { statements; }
 *
 * lambda表达式的具体特性:
 * 1. 可选的参数类型声明:
 *    无需声明参数类型, 编译器即可自动识别(当然声明了也没有错);
 * 2. 可选的参数圆括号:
 *    仅有一个参数时圆括号可以省略;
 * 3. 可选的大括号:
 *    主体只包含一个语句时可省略大括号;
 * 4. 可选的返回关键字:
 *    主体只包含一个表达式返回值并省略大括号时, 编译器会自动return返回值;
 *    有大括号时, 需要显式指定表达式return了一个数值;
 *
 * 示例请看下方代码:
 *     // 1. 无参数, 返回值1
 *     () -> 1
 *     // 2. 无参数, 无返回值
 *     () -> System.out.print("Java8 lambda.")
 *     // 3. 1个参数, 参数类型为数字, 返回值为其值的5倍
 *     x ->  5 * x
 *     // 4. 2个参数, 参数类型均为数字, 返回值为其差值
 *     (x, y) -> x - y
 *     // 5. 2个参数, 指定参数类型均为int型, 返回值为其差值
 *     (int x, int y) -> x - y
 *     // 6. 1个参数, 指定参数类型为String, 无返回值
 *     (String str) -> System.out.print(str)
 */

interface MyCalculator {
    double calculate(double a, double b);
}

public class Usage1 {
    public static void main(String[] args) {
        MyCalculator myCalculator = (a, b) -> {
            a = a + 2;
            b = b + 3;
            return a + b;
        };
        System.out.println(myCalculator.calculate(1, 2));
    }
}
