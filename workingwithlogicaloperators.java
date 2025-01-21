import java.util.Scanner;
public class workingwithlogicaloperators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("you are playing a game(press q or Q to quit):");
        String quit = scanner.nextLine();
        if(quit.equals("q") || quit.equals("Q")){
            System.out.println("you have quit the game");
        }
        else{
            System.out.println("you are still playing the game.");
        }
    }
}
