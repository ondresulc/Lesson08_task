import java.util.ArrayList;

public class PrintOutBasic {

    SchoolClass schoolClass4C;
    int numberOfStudents = 0;


    public static void main(String[] args) {
        PrintOutBasic  printOutBasic = new PrintOutBasic();
        ArrayList<Student>list  = new ArrayList<Student>();
        printOutBasic.schoolClass4C = new SchoolClass("4.C", 4, "Jan Novák", list);
        list.add(new Student("Petr", "Svoboda", 2011, "ID001"));
        list.add(new Student("Milan", "Říha", 2010, "ID123"));
        list.add(new Student("Jindřich", "Nový", 2012, "ID345"));
        printOutBasic.numberOfStudents = list.size();

        printOutBasic.printOutBasicClassData();

        printOutBasic.printClassStudents(list);

        System.out.println();

        PrintOut2 print = new PrintOut2();
        print.schoolClass4C = printOutBasic.schoolClass4C;
        print.printClassStudents(list);

        System.out.println();
        PrintOut3 print2 = new PrintOut3();
        print2.schoolClass4C = print.schoolClass4C;
        print2.printToFile(list, "myNewFile.txt");


    }

    public void printClassStudents(ArrayList<Student> list) {

        for (int i = 1; i <= list.size(); i++) {
            System.out.println("# "+ i +" # "
                    + list.get(i-1).getStudentId()
                    +" - " + list.get(i-1).getName()
                    +" " + list.get(i-1).getSurName() + " ("
                    + (list.get(i-1).getYearOfBirth()) +")");
        }
    }

    public void printOutBasicClassData() {

        String classInfo;

        classInfo = "####################################" + "\n"+"Třída: " + schoolClass4C.getClassName()+ " ("+"ročník"+": "+schoolClass4C.getGrade()+")" + "\n";
        classInfo += "Třídní učitel: "+schoolClass4C.getClassTeacher() + " \n";
        classInfo += "Počet studentů: " +numberOfStudents + "\n" + "\n";
        classInfo += "####################################";
        System.out.println(classInfo);
    }


}
