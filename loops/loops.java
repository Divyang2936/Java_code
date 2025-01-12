public class loops {

    public static void main(String[] args) {
        //for loop 
        for (int i=0; i<=100; i++){
            System.out.println("hello good morning" + i);
        }

        while loop 
        int i = 1;
        while (i<5) {
            System.out.println("hello good morning");
            i++;
        }

        do while loop 
        int i = 1;
        do{
            System.out.println("hello good morning");
            i++;
        }
        while (i>5);

        //inhanced loop 
        int arr[] = {1,2,3,4,5};
        for(int e : arr){
            System.out.println(e);
        }



        // practice 
        for(int i=0; i<=10; i++){
            System.out.print(" "+i);
            if(i==5) break;
        }
        //output: 0 1 2 3 4 5

        for(int i=0; i<=10; i++){
            if(i==5) continue;
            System.out.print(" "+i);
        }
        //output: 0 1 2 3 4 6 7 8 9 10


        for(int i=0; i<=5; i++){
            if(i==3) continue;
            for(int j=0; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //output;
        // 0
        // 11
        // 222
        // 44444
        // 555555


        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i);
            }
            if(i==3) break;
            System.out.println();
        }
        //output
        // 0
        // 11
        // 222
        // 3333

        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                if(i==3) continue ;
                System.out.print(i);
            }
            System.out.println();
        }
        //output
        // 0
        // 11
        // 222
        //
        // 44444
        // 555555

        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i);
            if(i==3) break;
            }
            System.out.println();
        }
        //output
        // 0
        // 11
        // 222
        // 3
        // 44444
        // 555555

        outer :for(int i=0; i<=5; i++){
            ineer : for(int j=0; j<=i; j++){
                if(i==3) continue outer;
                System.out.print(i);
            }
            System.out.println();
        }
        //output
        // 0
        // 11
        // 222
        // 44444
        // 555555

        outer :for(int i=0; i<=5; i++){
            if(i==3) continue ineer;
            ineer : for(int j=0; j<=i; j++){
                if(i==3) continue ineer;
                System.out.print(i);
            }
            System.out.println();
        }
        // 0
        // 11
        // 222
        //
        // 44444
        // 555555
    }
}