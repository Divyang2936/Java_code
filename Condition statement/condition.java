public class condition {

    public static void main(String[] args) {
        int money = 900;
        if (money > 1000){
            System.out.println("money is > 1000");
        }else if (money > 500 && money<900){
            System.out.println("money > 500 and money<900");//if both conditions are satisfied
        }
        else {
            System.out.println("Chote restro pr date");
        }

            if (money > 1000){
                System.out.println("money is > 1000");
            }else if (money > 500 || money<900){
                System.out.println("money > 500 or money<900");//if anyone conditions are satisfied
            }
            else {
                System.out.println("Chote restro pr date");
            }
        
    }
}