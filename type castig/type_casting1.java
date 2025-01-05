public class type_casting1 {

    public static void main(String[] args) {
        System.out.println("type castinng :");

        //automatis casting "Widening casting"
        float fvar = 23.23f;
        double dvar = fvar;


        //manual casting "nerrow casting "
        long lvar = (long) fvar;
        System.out.println(fvar);// output = 23.23
        System.out.println(dvar);// output = 23.229999542236328
        System.out.println(lvar);// output = 23

        //advamce type casting 
        //NP -> P ; P-> NP

        //P -> NP
        int a = 2;
        float f1= 22.4f;
        String str = String.valueOf(a);
        String str1 = String.valueOf(f1);
        System.out.println(a + a);//output = 4
        System.out.println(str + str);//output = 22
        System.out.println(str1 + str1);// output = 22.422.4

        //NP -> P
        String s1 = "2";
        String s2 = "22.4";
        int num = Integer.parseInt(s1);
        float fnum = Float.parseFloat(s2);
        System.out.println(num + num);//output = 4
        System.out.println(fnum + fnum);//output = 44.8
    }
}