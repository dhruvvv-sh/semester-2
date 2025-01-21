import java.util.Scanner;
class digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int x = sc.nextInt();
        int count = 0;
        int temp;
        while(x>0){
            temp = x % 10;
            count=count+1;
            x = x / 10;
        }
        System.out.print("the count is :"+count);
    }
    
}
