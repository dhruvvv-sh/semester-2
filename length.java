/*Create a class Lengthdim with fields inch and feet.
Write a
• constructor to initialize the Length object
• Method to display the length
• Method to add two length.*/ 
class Lengthdim {
    double inch;
    double feet;

    // Constructor to initialize the Length object
    Lengthdim(double f, double i) {
        feet = f;
        inch = i;
    }

    // Method to display the length
    void dis_length() {
        System.out.println("The length is: " + feet + " feet, " + inch + " inches");
    }

    // Method to add two lengths and return a new Lengthdim object
    Lengthdim add_length(Lengthdim other) {
        double totalInches = this.inch + other.inch;
        double totalFeet = this.feet + other.feet;

        // Convert inches to feet if inches exceed 12
        if (totalInches >= 12) {
            totalFeet += (int)(totalInches / 12);
            totalInches = totalInches % 12;
        }

        // Return a new Lengthdim object with the added values
        return new Lengthdim(totalFeet, totalInches);
    }
}

public class length{
    public static void main(String[] args) {
        // Create two length objects
        Lengthdim ob1 = new Lengthdim(5, 8);  // 5 feet 8 inches
        Lengthdim ob2 = new Lengthdim(3, 7);  // 3 feet 7 inches
        
        // Display the lengths
        ob1.dis_length();
        ob2.dis_length();
        
        // Add the two lengths and display the result
        Lengthdim result = ob1.add_length(ob2);
        System.out.println("The sum of the two lengths is:");
        result.dis_length();
    }
}

