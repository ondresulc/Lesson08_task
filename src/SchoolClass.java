import java.util.List;

public class SchoolClass {
    String className;
    int grade;
    String classTeacher;
    List<Student> listOfStudents;

    public SchoolClass(String name, int grade, String classTeacher, List<Student> listOfStudents) {
        this.className = name;
        this.grade = grade;
        this.classTeacher = classTeacher;
        this.listOfStudents = listOfStudents;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
}
