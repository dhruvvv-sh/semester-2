/*Create a Swapper class with two integer instance variables x
and y and a constructor with two parameters that initialize the two
variables. Also include three methods: a getX( ) method that
returns x, a getY( ) method that returns y, and a void swap( )
method that swaps the values of x and y. Then create a
SwapperDemo class that tests all the methods */
class Swapper{
    int n1;
    int n2;
    Swapper(int x,int y){
        n1 = x;
        n2 = y;
    }
    void swap(){
        int t;
        t = n1;
        n1 = n2;
        n2 = t;
        
    }
    int getX(){
        int q = n1;
        return q;
    }
    int getY(){
        int w = n2;
        return w;
    }

}
public class classesswap {
    public static void main(String[] args) {
        Swapper s1 = new Swapper(2,3);
        s1.swap();
        int num1 = s1.getX();
        int num2 = s1.getY();
        System.out.println("the numbers after switch are:"+num1+","+num2);
    }}

