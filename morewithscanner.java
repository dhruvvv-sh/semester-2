import java.util.Scanner;
public class morewithscanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello what is your name ");
        String name = scanner.next();
        //MATHS
        double x = 5;
        double y = -10;
        double z = Math.max(x, y);
        System.out.println("the largest number is :"+z);
        //square root
        double a = Math.sqrt(z);
        System.out.println("the square root of z is: "+a);
        //finding the hypotenuse in a triangle
        System.out.print("enter the height of triangle:");
        double height = scanner.nextDouble();
        System.out.print("enter the base of triangle:");
        double base = scanner.nextDouble();
        double hy = height*height + base*base;
        double hypo = Math.sqrt(hy);
        System.out.println("the hypotenuse length is:"+hypo);
    }
}
