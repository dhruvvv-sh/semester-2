import java.util.Scanner;

class boolpalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        // Call the palindrome method and print the result
        if (isPalindrome(x)) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
    }

    // Method to check if the number is a palindrome
    public static boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        int temp;

        // Reverse the number
        while (x > 0) {
            temp = x % 10;
            rev = rev * 10 + temp;
            x = x / 10;
        }

        // Check if the reversed number is equal to the original
        return original == rev;
    }
}
