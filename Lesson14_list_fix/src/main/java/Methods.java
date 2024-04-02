import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Methods {
    public Methods() {
    }

    public List<Student> getMales(List<Student> students) {
        List<Student> males = new ArrayList<>();
        if (students != null) {
            for (Student student : students) {
                if (student.isMan()) {
                    males.add(student);
                }
            }
        }
        return males;
    }

    public List<Student> getStudentsOlderThan20(List<Student> students) {
        List<Student> olderStudents = new ArrayList<>();
        if (students != null) {
            for (Student student : students) {
                if (student.getAge() > 20) {
                    olderStudents.add(student);
                }
            }
        }
        return olderStudents;
    }

    public List<Student> getStudentsWithLessThan2Classes(List<Student> students) {
        List<Student> lessClassesStudents = new ArrayList<>();
        if (students != null) {
            for (Student student : students) {
                if (student.getClasses() != null) {
                    for (String clas : student.getClasses())
                        if (clas != null && !student.getClasses().contains(null) && student.getClasses().size() < 2) {

                            lessClassesStudents.add(student);
                        }
                }
            }
        }
        return lessClassesStudents;
    }

    public List<Student> getStudentsWhoAttendProgramming(List<Student> students) {
        List<Student> programingStudents = new ArrayList<>();
        if (students != null) {
            for (Student student : students) {
                if (student.getClasses() != null && !student.getClasses().isEmpty()) {
                    for (String clas : student.getClasses()) {
                        if (clas != null && clas.equals("programing")) {
                            programingStudents.add(student);
                            break;
                        }
                    }

                }
            }
        }
        return programingStudents;
    }
}