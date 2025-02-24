
class person {//create person class
    String name ;//declare instance variable name 
    int age ;//declare instance variable age 
    void displayDetail(){
        System.out.println("Name : " + name + " " + ", age : " + age);
    }
}

class employee extends person{//create employ class inherit peson class
    int salary;//declare instance variable salary
    void displayEmployeeDetail(){
        displayDetail();
        System.out.println("salary is : "+salary);
    }
}
public class _24_02_2025 {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.name = "deep";//initialize value of name 
        emp.age = 20;//initialize value of age
        emp.salary= 50000;//initialize value of salary

        //display details call displayEmployeeDetail
        emp.displayEmployeeDetail();
    }
}
