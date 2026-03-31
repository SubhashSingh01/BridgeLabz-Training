package online_course_enrollment_manager;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class CourseEnrollmentManager {

    public static void main(String[] args) {

        List<Enrollment> enrollments = Arrays.asList(
                new Enrollment("Amit", "Java", "Programming", LocalDate.of(2025, 1, 10)),
                new Enrollment("Riya", "Python", "Programming", LocalDate.of(2025, 1, 12)),
                new Enrollment("Karan", "Photoshop", "Design", LocalDate.of(2025, 1, 8)),
                new Enrollment("Sneha", "Java", "Programming", LocalDate.of(2025, 1, 15)),
                new Enrollment("Rahul", "UI/UX", "Design", LocalDate.of(2025, 1, 18))
        );

        System.out.println("Students enrolled in Java: ");
        enrollments.stream().filter(e -> e.getCourseName().equalsIgnoreCase("Java")).forEach(System.out::println);

        System.out.println("Programming Category: ");
        enrollments.stream().filter(e -> e.getCategory().equalsIgnoreCase("Programming")).forEach(System.out::println);

        System.out.println("Grouped by Course: ");
        Map<String, List<Enrollment>> groupByCourse = enrollments.stream().collect(Collectors.groupingBy(Enrollment::getCourseName));

        groupByCourse.forEach((course, list) -> {
            System.out.println(course + " -> " + list);
        });

        System.out.println("Count per Category: ");
        Map<String, Long> countByCategory = enrollments.stream().collect(Collectors.groupingBy(Enrollment::getCategory,Collectors.counting() ));

        countByCategory.forEach((category, count) ->
                System.out.println(category + " = " + count));

        System.out.println("Sorted by Enrollment Date: ");
        enrollments.stream().sorted(Comparator.comparing(Enrollment::getEnrollmentDate)).forEach(System.out::println);
    }
}
