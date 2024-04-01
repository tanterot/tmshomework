import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static List<Student> getMales(List<Student> students) {
        List<Student> males = new ArrayList<>();
        if (students != null) {
            for (Student student : students) {
                if (student != null && student.getClasses() != null && student.isMan()) {
                    males.add(student);
                }
            }
        }
        return males;
    }

    public static List<Student> getStudentsOlderThan20(List<Student> students) {
        List<Student> olderStudents = new ArrayList<>();
        if (students != null) {
            for (Student student : students) {
                if (student != null && student.getClasses() != null && student.getAge() > 20) {
                    olderStudents.add(student);
                }
            }
        }
        return olderStudents;
    }

    public static List<Student> getStudentsWithLessThan2Classes(List<Student> students) {
        List<Student> lessClassesStudents = new ArrayList<>();
        if (students != null) {
            for (Student student : students) {
                if (student != null && student.getClasses() != null && student.getClasses().size() < 2) {
                    lessClassesStudents.add(student);
                }
            }
        }
        return lessClassesStudents;
    }

    public static List<Student> getStudentsWhoAttendProgramming(List<Student> students) {
        List<Student> programmingStudents = new ArrayList<>();
        if (students != null) {
            for (Student student : students) {
                if (student != null && student.getClasses() != null && student.getClasses().contains("programing")) {
                    programmingStudents.add(student);
                }
            }
        }
        return programmingStudents;
    }
}
