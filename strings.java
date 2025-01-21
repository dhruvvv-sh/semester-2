import java.util.Scanner;
public class strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "hello im new to coding";
        System.out.println("the string in all upper case:"+str.toUpperCase());
        System.out.println("the string in all lower case:"+str.toLowerCase());
        System.out.println(str.indexOf("im"));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.min(2,100));
        /*String[] cars = new String[10];
        for(int i =0;i<10;i++){
            cars[i]=sc.next();
        }
        for(int i=0;i<10;i++){
        System.out.println(cars[i]);
        }*/
        String car[] = {"volvo","bmw","benz"};
        System.out.println(car.length);
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7,8} };
        for (int i = 0; i < myNumbers.length; i++) {
           for(int j = 0; j < myNumbers[i].length; j++) {
              System.out.print(myNumbers[i][j]+"\t");
           }System.out.println(" ");
    }
}}
