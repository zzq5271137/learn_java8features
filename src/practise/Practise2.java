package practise;

/*
 * 使用Stream API和Optional, 从一个Student集合中筛选出所有年龄大于18岁且小于25岁的学生,
 * 并将合格的学生重命名(加上"_pass"后缀), 并将合格的学生的名字生成一个新集合返回;
 * 注意, 给定的集合中可能有null;
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

class StudentFilterException extends RuntimeException {
    public StudentFilterException() {
        super("Unknown error when filtering students");
    }
}

public class Practise2 {
    public static List<Student> init() {
        return Arrays.asList(null, new Student("zzq1", 12),
                new Student("zzq2", 20),
                new Student("zzq3", 24),
                new Student("zzq4", 27));
    }

    // 写法一
    public static List<String> stuFilter1(List<Student> students, Predicate<Integer> agePredicate1,
                                          Predicate<Integer> agePredicate2) {
        List<String> passNames = new ArrayList<>();
        students.stream()
                .filter(s -> Optional.ofNullable(s)
                        .filter(s1 -> agePredicate1.and(agePredicate2).test(s1.getAge()))
                        .isPresent())
                .forEach(sp -> passNames.add(
                        Optional.of(sp).map(sp1 -> sp1.getName() + "_pass")
                                .orElseThrow(StudentFilterException::new)));
        return passNames;
    }

    // 写法二
    public static List<String> stuFilter2(List<Student> students, Predicate<Integer> agePredicate1,
                                          Predicate<Integer> agePredicate2) {
        List<String> passNames = new ArrayList<>();
        students.forEach(s -> Optional.ofNullable(s)
                .filter(s1 -> agePredicate1.and(agePredicate2).test(s1.getAge()))
                .ifPresent(s2 -> passNames.add(s2.getName() + "_pass")));
        return passNames;
    }

    public static void main(String[] args) {
        List<Student> students = init();
        System.out.println("过滤前: " + students);
        List<String> passNames = stuFilter2(students, age -> age > 18, age -> age < 25);
        System.out.println("过滤后的学生名字: " + passNames);
    }
}
