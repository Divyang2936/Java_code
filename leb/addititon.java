class Additio{
    void add(int a , int b){
        System.out.println(a+b);
    }
    void add (int a, int b, int c){
        System.out.println(a + b + c);
    }
}




public class addititon {

    public static void main(String[] args) {
        Additio a = new Additio();
        a.add(1, 2);
        a.add(1, 2, 2);
    }
}