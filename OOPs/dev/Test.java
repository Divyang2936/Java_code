import Mypackage1.*;
import Mypackage2.myClass;
// import Mypackage2.myClass2;



public class Test {

    public static void main(String[] args) {
        // System.out.println(Employee.phoneNo);
        // Employee enginear = new Employee();//defould constructor 
        // System.out.println(enginear.basicSal);

        // //calling class using package from package 1
        // MyClass yClass = new MyClass();
        // yClass.print();

        // //calling class using package from package 2
        // myClass call = new myClass();
        // call.print();

        //create constructor and call
        //constructor with parameter 
        Employee enginear = new Employee("Divyang", 21);

        System.out.println(enginear.getphoneNo());//cal; the constructor 
        System.out.println(enginear.getName());//cal; the constructor 

        //simpe constructor
        //if you not create simle constructor this will be give you error 
        Employee engineer2 = new Employee( );
        System.err.println(engineer2.getName());//cal; the constructor 
        System.out.println(engineer2.getphoneNo());//cal; the constructor 

    }
}