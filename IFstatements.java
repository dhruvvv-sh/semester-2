import java.util.Scanner;
public class IFstatements {
    public static void main(String[] args){
        //working with if statements 
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        if(age>=18){
            System.out.print("you can drive");
        }
        else{
            System.out.println("you cannot drive");
        }
    }
}