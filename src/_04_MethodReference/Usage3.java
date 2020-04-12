package _04_MethodReference;

/*
 * 参考: https://www.jianshu.com/p/62465b26818f
 *
 * 构造器引用:
 * 构造器引用的语法格式为:
 *     类名::new
 * 如:
 *     ArrayList<String>::new
 *     等价于lambda表达式
 *     () -> new ArrayList<String>()
 * 构造器引用适用于lambda表达式主体中仅仅调用了某个类的构造函数返回实例的场景;
 */

public class Usage3 {
    public static void main(String[] args) {
    }
}
