import java.util.Scanner;

public class stringmenudriven {
    // Function to check if the string is a palindrome
    static void checkPalindrome(String n) {
        String s = n;
        int length = s.length();
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    // Function to sort the string in alphabetical order
    static void sortAlphabetical(String n) {
        char[] charArray = n.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        String sortedString = new String(charArray);
        System.out.println("String in alphabetical order: " + sortedString);
    }
    // Function to reverse the string
    static void reverseString(String n) {
        StringBuilder reversedString = new StringBuilder(n);
        System.out.println("Reversed string: " + reversedString.reverse().toString());
    }
    // Function to concatenate the original string with its reversed version
    static void concatenateOriginalAndReversed(String n) {
        StringBuilder reversedString = new StringBuilder(n);
        String result = n + reversedString.reverse().toString();
        System.out.println("Concatenated original and reversed string: " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check if the string is a palindrome");
            System.out.println("2. Write the string in alphabetical order");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate the original string with the reversed string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character
            switch (choice) {
                case 1:
                    checkPalindrome(str);
                    break;
                case 2:
                    sortAlphabetical(str);
                    break;
                case 3:
                    reverseString(str);
                    break;
                case 4:
                    concatenateOriginalAndReversed(str);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}