import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PrintOut3 extends PrintOutBasic {
    @Override
    public void printClassStudents(ArrayList<Student> list) {
        System.out.println("Class: " +super.schoolClass4C.getClassName()+", " + "Teacher's name: " +super.schoolClass4C.getClassTeacher());
        for (int i = 1; i <= list.size(); i++) {
            System.out.println("Student_"+i+": " +"(" +list.get(i-1).getStudentId()
                    +") " + list.get(i-1).getName()
                    +" " + list.get(i-1).getSurName());
        }
    }

    public void printToFile(ArrayList<Student> list, String fileName) {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            pw.println("Brand new file");
            pw.println("--------------");
            pw.print("Class: " +super.schoolClass4C.getClassName()+", " + "Teacher's name: " +super.schoolClass4C.getClassTeacher() +"\n");

            for (int i = 1; i <= list.size(); i++) {
                pw.println("Student_"+i+": " +"(" +list.get(i-1).getStudentId()
                        +") " + list.get(i-1).getName()
                        +" " + list.get(i-1).getSurName());
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
