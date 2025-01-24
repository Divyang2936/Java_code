class Student1 {
    static String SchoolName = "KHS";
    String StudentName;
    int StudentAge ;

    public void Print(){
        System.out.println(StudentName + " : " + StudentAge + " : " + SchoolName);
    }

    public static void Print1(Student1 newStudent){
        System.out.println(newStudent.StudentName + " : " + newStudent.StudentAge + " : " + SchoolName);
    }
}

public class static_method {

    public static void main(String[] args) {

        Student1 newStudent1 = new Student1();
        newStudent1.StudentName = "Divyang";
        newStudent1.StudentAge = 20;

        Student1 newStudent2 = new Student1();
        newStudent2.StudentName = "Dev";
        newStudent2.StudentAge = 20;

        //calling the print method for printing the detail
        newStudent1.Print();
        newStudent2.Print();
        Student1 newStudent3 = new Student1();
        newStudent3.StudentName = "Dev";
        newStudent3.StudentAge = 20;

        Student1.Print1(newStudent3);
    }
}