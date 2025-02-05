import java.util.Scanner;
public class arraymarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks:");
        byte[] marks = new byte[5];
        for(byte i=0;i<5;i++){
            marks[i]= sc.nextByte();
        }
        System.out.println("the marks are:");
        for(byte i=0;i<5;i++){
            System.out.println(marks[i]);
        }
    }
}
