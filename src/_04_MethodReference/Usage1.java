package _04_MethodReference;

/*
 * 参考: https://www.jianshu.com/p/62465b26818f
 *
 * 方法引用的规则:
 * java8方法引用有四种形式:
 * 1. 静态方法引用:
 *    ClassName :: staticMethodName
 * 2. 构造器引用:
 *    ClassName :: new
 * 3. 类的任意对象的实例方法引用:
 *    ClassName :: instanceMethodName
 * 4. 特定对象的实例方法引用:
 *    object :: instanceMethodName
 *
 * lambda表达式可用方法引用代替的场景可以简要概括为:
 * lambda表达式的主体仅包含一个表达式, 且该表达式仅调用了一个已经存在的方法;
 *
 * 方法引用的通用特性:
 * 方法引用所使用方法的入参和返回值与lambda表达式实现的函数式接口的入参和返回值一致;
 */

public class Usage1 {
    public static void main(String[] args) {
    }
}
