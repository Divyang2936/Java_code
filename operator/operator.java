public class operator {

    public static void main(String[] args) {
        // Arithmetic operator
        int a = 2; 
        int b = 3;
        System.out.println(a + b);//output 5
        System.out.println(a - b);//output -1
        System.out.println(a * b);//output 6
        System.out.println(10 / 2);//output 5
        System.out.println(10 % 2);//output 0

        // Unary operator
        //Pre increment / post increment (++)
        System.out.println(a++);//output 2
        int c = a ;
        System.out.println(c);//putput 3
        System.out.println(++b);//output 4

        //pre decrement / post decrement (--)
        System.out.println(a--);//output 3
        int d = a ;
        System.out.println(d);//output 2
        System.out.println(--b);//output 3

        //relational operator 
        System.out.println(3==2);//output false
        System.out.println(3!=2);//output true  
        System.out.println(3>4);//output false 
        System.out.println(3<2);//output flase 

        // Ternary  operator
        //if the condition is right output is first value 
        //if the condition is wrong output is second value 
        boolean bool = (5>2)?true:false;
        System.out.println(bool);
        String bool1 = (5<2)?"bada hai":"chota hai ";
        System.err.println(bool1);

        //shift operator 
        System.out.println(5>>2);// 5 divide by 2 to the power of shift"2"          //output 1
        System.out.println(20<<2);// 20 multiplied by 2 to the power of shift"2"    //output 80
        System.out.println(5<<2);// 5 multiplied by 2 to the power of shift"2"      //output 20
        System.out.println(20>>2);//20 divide by 2 to the power of shift"2"         //output 5
        System.out.println(-20>>2);//20 divide by 2 to the power of shift"2"        //output -5
        System.out.println(20>>>2);//20 divide by 2 to the power of shift"2"        //output 5
        System.out.println(-20>>>2);//20 divide by 2 to the power of shift"2"       //output 1073741819

        //short hande operator 
        int num1 = 2;
        int num2 = 3;
        num1 += num2;// num1 = num1 +num2; //output 5
        num2 -=num1;//num2 = num2 - num1;  //output -2
        System.out.println(num1);
        System.out.println(num2);
        

    }
}