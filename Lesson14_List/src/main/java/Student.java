import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Boolean isMan;
    private Integer age;
    private List<String> classes;


    public static List<Student> getMales(List<Student> students) {
        List<Student> males = new ArrayList<>();
        for (Student student : students) {
            if (student.getIsMan()) {
                males.add(student);
            }
        }
        return males;
    }

    public static List<Student> getStudentsOlderThan20(List<Student> students) {
        List<Student> olderStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > 20) {
                olderStudents.add(student);
            }
        }
        return olderStudents;
    }

    public static List<Student> getStudentsWithLessThan2Classes(List<Student> students) {
        List<Student> lessClassesStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getClasses().size() < 2) {
                lessClassesStudents.add(student);
            }
        }
        return lessClassesStudents;
    }

    public static List<Student> getStudentsWhoAttendProgramming(List<Student> students) {
        List<Student> programmingStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getClasses().contains("programing")) {
                programmingStudents.add(student);
            }
        }
        return programmingStudents;
    }
}