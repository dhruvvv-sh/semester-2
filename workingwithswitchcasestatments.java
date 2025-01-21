import java.util.Scanner;
public class workingwithswitchcasestatments {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.print("enter the day:");
        String day = scanner.nextLine();
        switch(day){
            case "monday":
            System.out.println("its monday!");
            break;
            case "tuesday":
            System.out.println("its tuesday");
            break;
            case "wednesday":
            System.out.println("its wednesday");
            break;
            case "thursday":
            System.out.println("its thursday");
            break;
            case "friday":
            System.out.println("its friday");
            break;
            case "saturday":
            System.out.println("its saturday");
            break;
            case "sunday":
            System.out.println("its sunday");
            break;
        }
    } 
}
