class Student1 {
    static String SchoolName = "KHS";
    String StudentName;//instance variable that means it will be diffrent for diffrent object 
    int StudentAge ;

    //this is non static method 
    //if we create non static method we want to creat object 
    public void Print(){
        System.out.println(StudentName + " : " + StudentAge + " : " + SchoolName);
    }

    //creating simple static method 

    public static void PrintHello(){
        System.out.println("hello this message from static method ");
    }

    //passing the object refrance 
    public static void Print1(Student1 newStudent){
        System.out.println(newStudent.StudentName + " : " + newStudent.StudentAge + " : " + SchoolName);
    }

}

public class static_method {

    public static void main(String[] args) {

        //creating object newStudent1 for non static method 
        Student1 newStudent1 = new Student1();
        newStudent1.StudentName = "Divyang";
        newStudent1.StudentAge = 20;

        //creating object newStudent1 for non static method 
        Student1 newStudent2 = new Student1();
        newStudent2.StudentName = "Dev from obj 2";
        newStudent2.StudentAge = 20;

        //calling the print method for printing the detail
        //calling the non static method using object 
        //you cant call the non static method whith the help of class name 
        newStudent1.Print();
        newStudent2.Print();

        //call the static method with the help of class name 
        Student1.PrintHello();

        Student1.Print1(newStudent2);

        Student1 newStudent3 = new Student1();
        newStudent3.StudentName = "Dev from obj 3";
        newStudent3.StudentAge = 20;

        Student1.Print1(newStudent3);

    }
}