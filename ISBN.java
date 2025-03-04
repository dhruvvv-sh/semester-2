import java.util.Scanner;

public class ISBN {
    // Method to calculate the weighted sum
    int calc(int[] ISBN) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i * ISBN[i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare the array to hold 10 digits of the ISBN
        int[] ISBN = new int[10];

        System.out.println("Enter the 10-digit ISBN PIN:");

        // Input the 10 digits one by one
        for (int i = 0; i < 10; i++) {
            ISBN[i] = sc.nextInt();
        }

        // Check if the input length is valid
        if (ISBN.length != 10) {
            System.out.println("Invalid input! ISBN should be 10 digits.");
        } else {
            // Create an ISBN object to use the calc method
            ISBN isbnObj = new ISBN();
            int sum = isbnObj.calc(ISBN);

            // Output the result
            System.out.println("The sum of the weighted ISBN digits is: " + sum);
        }
    }
}
