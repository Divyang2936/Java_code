import Mypackage1.*;


class Employee {

    int empId = 2;
    static int phoneNo = 0;
    private String name = "Divyang";
    int basicSal = 20000;
    int incentive = 200;

    void countSal(){
        System.out.println(basicSal + incentive);
    }

}
public class Test {

    public static void main(String[] args) {
        System.out.println(Employee.phoneNo);
        Employee enginear = new Employee();
        System.out.println(enginear.basicSal);

        //calling class using package
        MyClass myClass = new MyClass();
        myClass.print();
    }
}