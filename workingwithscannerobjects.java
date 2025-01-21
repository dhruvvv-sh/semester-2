import java.util.Scanner;
public class workingwithscannerobjects {
    //working with scanner for the comp to take input from user
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("what is your fav food");
        String food = scanner.nextLine();
        System.out.println("whats your age:");
        int age = scanner.nextInt();
        System.out.println("hello "+name); 
        System.out.println("your favourite food is:"+food);
        System.out.println("your age is:"+age);
        
    }
}
