import java.util.Scanner;
class gcdoftwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int x = sc.nextInt();
        System.out.print("Enter num2: ");
        int y = sc.nextInt();

        // Calculate GCD using Euclidean algorithm
        int gcd = findGCD(x, y);

        System.out.println("The GCD of " + x + " and " + y + " is: " + gcd);
    }

    public static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
