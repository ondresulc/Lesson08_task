import java.util.ArrayList;

public class PrintOut2 extends PrintOutBasic {

    @Override
    public void printClassStudents(ArrayList<Student> list) {
        System.out.println(super.schoolClass4C.getClassName()+", " +super.schoolClass4C.getClassTeacher());
        for (int i = 1; i <= list.size(); i++) {
            System.out.println(list.get(i-1).getStudentId()
                    +", " + list.get(i-1).getName()
                    +" " + list.get(i-1).getSurName());
        }
    }
}
