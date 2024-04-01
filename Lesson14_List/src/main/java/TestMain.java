import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan",true,18, Arrays.asList("programing","literature")));
        students.add(new Student("Ivan", true, 18, Arrays.asList("programing", "literature")));
        students.add(new Student("Mariya", false, 19, Arrays.asList("physics", "history")));
        students.add(new Student("Alex", true, 21, Arrays.asList("programing")));
        students.add(new Student("Natalia", false, 23, Arrays.asList("mathematics", "literature", "programing")));
        students.add(new Student("Petr", true, 20, Arrays.asList("history")));

        List<Student> studentsOlderThan20 = Methods.getStudentsOlderThan20(students);
        List<Student> males = Methods.getMales(students);
        List<Student> studentsWithLessThan2Classes = Methods.getStudentsWithLessThan2Classes(students);
        List<Student> studentsWhoAttendProgramming = Methods.getStudentsWhoAttendProgramming(students);
        System.out.println("OLD >20 : " + studentsOlderThan20);
        System.out.println("MAN: " + males);
        System.out.println(">2 Classes " + studentsWithLessThan2Classes);
        System.out.println("Programiming " + studentsWhoAttendProgramming);
    }
}
