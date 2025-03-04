import java.util.Scanner;
public class menudriven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String:");
        String str = sc.nextLine();
        int n = str.length();
        String pall;
        int P = 1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)!= str.charAt(n-i-1)){
                P=0;
                break;
            }
        }
        if(P==1){
            System.out.println("the String is a pallindrome");
        }
        else{
            System.out.println("The string is not a pallinderome");
        }
    }
}
