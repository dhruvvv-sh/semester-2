public class learningmethods {
    static void MyMethod(){
        System.out.println("my first method code!");
    }
    static int Add(int x , int y){
        int sum = x + y;
        return(sum);
    }
    static int gcd(int a,int b){
        if (b == 0) {
            return a;
        }
        // Recursive call: GCD of b and a % b
        return gcd(b, a % b);
    }
    public static void main(String[] args){
        MyMethod();
        int callbackaddfunc = Add(3,4);
        System.out.println("this is the sum of the call back function add:"+callbackaddfunc);
        System.out.println("this is the gcd of the call back function gcd:"+gcd(9,81));

    }

}
