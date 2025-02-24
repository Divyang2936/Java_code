
class person {
    String name ;
    int age ;
    void displayDetail(){
        System.out.println("Name : "+ name + " " + ", age : "+age);
    }
}

class employee extends person{
    int salary;
    void displayEmployeeDetail(){
        displayDetail();
        System.out.println("salary is : "+salary);
    }
}
public class _24_02_2025 {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.name = "deep";
        emp.age = 20;
        emp.salary= 50000;

        //display details
        emp.displayEmployeeDetail();
    }
}
