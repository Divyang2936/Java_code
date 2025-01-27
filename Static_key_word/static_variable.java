class Student {
    static String SchoolName = "KHS";
    String StudentName;
    int StudentAge ;

    void Print(){
        System.out.println(StudentName + " " + StudentAge );
    }
    
}

public class static_variable {
    public static void main(String[] args) {

        Student newStudent1 = new Student();
        

        newStudent1.StudentName = "Divyang";
        newStudent1.StudentAge = 20;
        System.out.println(Student.SchoolName);
        newStudent1.Print();

        Student.SchoolName = "knowledge ";
        Student newStudent2 = new Student();
        newStudent2.StudentName = "Dev";
        newStudent2.StudentAge = 20;
        newStudent2.Print();
        System.out.println(Student.SchoolName);

    }
}