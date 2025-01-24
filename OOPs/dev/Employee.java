class Employee {

    private int empId = 2;
    private int phoneNo = 0;
    private String name ;
    private int basicSal = 20000;
    private int incentive = 200;

    

    void countSal(){
        System.out.println(basicSal + incentive);
    }

    //getter and setter

    int getphoneNo(){
        return phoneNo;
    }

    String getName(){
        return name;
    }

    //constructor "creat non returen type method"

    public Employee(String empName, int PhNo){
        phoneNo = PhNo;
        name = empName;
    }

    //create simple constructor 
    Employee(){
        phoneNo=222;
        name = "Dhaval";
    }

}
