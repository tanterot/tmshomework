import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", true, 18, Arrays.asList("programing", "literature")));
        students.add(new Student("Mariya", false, 19, Arrays.asList("physics", "history")));
        students.add(new Student("Alex", true, 21, Arrays.asList("programing")));
        students.add(new Student("Natalia", false, 23, Arrays.asList("mathematics", "literature", "programing")));
        students.add(new Student("Petr", true, 20, Arrays.asList("history")));

        System.out.println("Young men");
        List<Student> males = Methods.getMales(students);
        System.out.println(males);

        System.out.println("Students over 20 years old:");
        List<Student> studentsOlderThan20 = Methods.getStudentsOlderThan20(students);
        System.out.println(studentsOlderThan20);

        System.out.println("Students who attend less than 2 classes:");
        List<Student> studentsWithLessThan2Classes = Methods.getStudentsWithLessThan2Classes(students);
        System.out.println(studentsWithLessThan2Classes);

        System.out.println("Students who attend the class - programming:");
        List<Student> studentsWhoAttendProgramming = Methods.getStudentsWhoAttendProgramming(students);
        System.out.println(studentsWhoAttendProgramming);
    }

}
