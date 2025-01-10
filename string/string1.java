public class string1 {

    public static void main(String[] args) {

        // //in java String are immutable that's why we can't modify

        // String s1 = "java    ";
        // String s2 = "Java";

        String s3 = "hello";

        // System.out.println(s1.equals(s2));

        // System.out.println(s1.equalsIgnoreCase(s2));

        // System.out.println(s1.toUpperCase());
        // System.out.println(s2.toLowerCase());

        // System.out.println(s1.trim());

        // System.out.println(s3.replace('l','L'));

        System.out.println(s3.startsWith(s3));





        String str1 = "Divyang@patel";
        // System.out.println(str1.substring(7));

        // System.out.println(str1.contains("patel"));
        // System.out.println(str1.lastIndexOf("patel"));


        String [] arr = str1.split("@");
        for (String a : arr){
            System.out.println(a);
        }


        int a = 2;
        System.out.println(String.valueOf(a));



        // System.out.println(str1.split("," ,2));
        

        // String str3 = new String("Divyang");//creat the new memory and point

        // System.out.println(str1 == str2);//point the same value in string pool 
        // System.out.println(str1 == str3);//compair insance
        // System.out.println(str1.equals(str2));//compair contant
        // System.out.println(str1.equals(str3));

        //StringBuffer
        // StringBuffer sb = new StringBuffer("Divyang.");

        // System.out.println(sb);
        // sb.append(" Patel");
        // System.out.println(sb);
        // sb.deleteCharAt(7);
        // System.out.println(sb);
        // sb.delete(7, 13);
        // System.out.println(sb);
        // sb.insert(7, "P");
        // System.out.println(sb);
        
    }
}