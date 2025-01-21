import java.util.Scanner;
class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int x = sc.nextInt();
        int temp;
        int n = x;
        int rev=0;
        while(n>0){
            temp = n % 10;
            rev = rev*10 + temp;
            n = n / 10;
        }
        System.out.println("the reversed is :"+rev);
        if (rev == x) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
    
}
