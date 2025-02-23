public class static_variable2 {
            static int x=100;  //static variable 
            public static void main(String[] args) 
                { System.out.println(x);  //1-way(directly possible) 
        System.out.println(static_variable2.x); //2-way(By using class name) 
        static_variable2 t= new static_variable2(); System.out.println(static_variable2.x); //3-way(By using reference variable) 
        } 
}
