import java.util.Scanner;
class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1:");
        int x = sc.nextInt();
        System.out.print("enter num2:");
        int y = sc.nextInt();
        if (x==0 || y==0){
            System.out.println("the number should be a natural number.");
            System.exit(0);
        }
        int sum = x + y;
        System.out.println("the sum is:"+sum);
    }
}