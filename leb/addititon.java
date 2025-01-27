// class FindArea{
//     void add(int a , int b){
//         System.out.println(a+b);
//     }
//     void add (int a, int b, int c){
//         System.out.println(a + b + c);
//     }
// }
class FindArea{
    // void area(int r){
    //     System.out.println("Area of circle = " + 3.14*r*r);
    // }
    // void area(int l, int w){
    //     System.err.println();
    // }
    void area(float h ,float w){
        System.out.println((1/2) *h*w);
    }
    void area(int l){
        System.out.println(l*l);
    }
}



public class addititon {

    public static void main(String[] args) {
        FindArea a = new FindArea();
        a.area(4 );
        a.area(4,5);

    }
}