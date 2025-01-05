public class string1 {

    public static void main(String[] args) {

        // //in java String are immutable that's why we can't modify
        // String str1 = "Divyang";
        // String str2 = "Divyang";
        // String str3 = new String("Divyang");//creat the new memory and point

        // System.out.println(str1 == str2);//point the same value in string pool 
        // System.out.println(str1 == str3);//compair insance
        // System.out.println(str1.equals(str2));//compair contant
        // System.out.println(str1.equals(str3));

        //StringBuffer
        StringBuffer sb = new StringBuffer("Divyang.");

        System.out.println(sb);
        sb.append(" Patel");
        System.out.println(sb);
        sb.deleteCharAt(7);
        System.out.println(sb);
        sb.delete(7, 13);
        System.out.println(sb);
        sb.insert(7, "P");
        System.out.println(sb);
    }
}