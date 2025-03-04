import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.next();
        int n = str.length();
        char[] charArray = str.toCharArray();
        int pal = 0;
        for(int i=0;i<n/2;i++){
            if (charArray[i]!=charArray[n-i-1]){
                pal = 1;
                break;
            }
        }
        if(pal==1){
            System.out.println("not a pallindrome");
        }
        else{
            System.out.println("pallindrome");
        }
        
    }
}
