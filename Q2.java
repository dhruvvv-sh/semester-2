import java.util.Random;

class Die {
    Random rand = new Random();
    int sideUp; // instance variable to store the current side

    // Method to get the current sideUp value
    int getSideUp() {
        return sideUp;
    }

    // Method to roll the die, setting sideUp to a random value between 1 and 6
    void roll() {
        sideUp = rand.nextInt(6) + 1; // random number between 1 and 6
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Create two Die objects
        Die d1 = new Die();
        Die d2 = new Die();

        // Roll both dice
        d1.roll();
        d2.roll();

        // Get the values of both dice
        int x1 = d1.getSideUp();
        int x2 = d2.getSideUp();

        // Calculate the sum
        int sum = x1 + x2;

        // Print the results
        System.out.println("The values are: " + x1 + " and " + x2);
        System.out.println("The sum is: " + sum);
    }
}
