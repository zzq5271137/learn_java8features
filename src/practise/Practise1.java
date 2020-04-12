package practise;

/*
 * 使用Stream API和Optional, 从一个Student集合中筛选出所有年龄大于18岁且小于25岁的学生,
 * 并将合格的学生重命名(加上"_pass"后缀), 并生成一个新集合;
 * 注意, 给定的集合中可能有null;
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Student {
    private String name;
    private int age;
}

public class Practise1 {
    public static List<Student> init() {
        return Arrays.asList(null, new Student("zzq1", 12),
                new Student("zzq2", 20),
                new Student("zzq3", 24),
                new Student("zzq4", 27));
    }

    public static List<Student> stuFilter(List<Student> students, Predicate<Integer> agePredicate1,
                                          Predicate<Integer> agePredicate2) {
        return students.stream()
                .filter(s -> Optional.ofNullable(s)
                        .filter(s1 -> agePredicate1.and(agePredicate2).test(s1.getAge()))
                        .isPresent())
                .map(sp -> new Student(sp.getName() + "_pass", sp.getAge()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> students = init();
        System.out.println("过滤前: " + students);
        students = stuFilter(students, age -> age > 18, age -> age < 25);
        System.out.println("过滤后: " + students);
    }
}
