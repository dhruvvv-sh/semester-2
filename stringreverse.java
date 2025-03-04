import java.util.Scanner;
public class stringreverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String str = sc.nextLine();
        String[] words  = str.split(" ");
        String reverse = "";
        for(String word:words){
            char[] charArray = word.toCharArray();
            String reverseWord = "";
            for(int i=charArray.length-1;i>=0;i--){
                reverseWord += charArray[i];
            }
            reverse += reverseWord+" ";
        }
        System.out.println("Reversed string: " + reverse);
    }    
}
