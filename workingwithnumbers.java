public class workingwithnumbers {
    public static void main(String[] args){
        int x = 5; //assuming the value of x to be 5
        int y = 6; //assuming the value of y to be 6
        int sum = x + y; //finding the sum 
        System.out.println("the sum is:"+sum);
        //focusing on replacing two variables
        String z = "hello";
        String p = "test";
        String temp;
        temp = z;
        z = p;
        p = temp;
        System.out.println("the new values of z:"+ z + " and the value of P is :"+p);
    }
}
