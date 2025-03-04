import java.util.Scanner;
class Employee {
    private String name;
    private String email;
    // Parameterized constructor to initialize the employee object
    public Employee(String name) {
        this.name = name;
        this.email = generateEmail();
    }
    // Method to format the employee's name by capitalizing the first letter of each word
    public void formatEmployeeName() {
        String[] words = name.split(" ");
        StringBuilder formattedName = new StringBuilder();  
        for (String word : words) {
            if (word.length() > 0) {
                formattedName.append(Character.toUpperCase(word.charAt(0)))
                             .append(word.substring(1).toLowerCase())
                             .append(" ");
            }
        }
        // Remove the last space and update the name
        name = formattedName.toString().trim();
    }
    // Method to generate the employee's email address based on their name
    public String generateEmail() {
        String[] words = name.split(" ");
        String emailUsername = words[0].substring(0, 1).toLowerCase(); // First letter of first name
        if (words.length > 1) {
            emailUsername += words[words.length - 1].toLowerCase(); // Last name
        }
        return emailUsername + "@example.com";
    }
    //Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Email: " + email);
    }
    // Getter method for the employee name
    public String getName() {
        return name;
    }
}
public class employeeID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Asking user for the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        // Creating an array of Employee objects
        Employee[] employees = new Employee[numEmployees];
        // Reading employee details and initializing objects
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("\nEnter the name of employee " + (i + 1) + ": ");
            String name = sc.nextLine();
            employees[i] = new Employee(name);
        }
        // Displaying formatted names and emails for each employee
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < numEmployees; i++) {
            employees[i].formatEmployeeName();  // Format the name
            employees[i].displayEmployeeDetails(); // Display formatted name and email
        }
        sc.close();
    }
}
