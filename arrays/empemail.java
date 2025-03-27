import java.util.Scanner;

class Employee {
    private String name;
    
    // Constructor to initialize the Employee object
    public Employee(String name) {
        this.name = name;
    }
    
    // Method to format the employee's name (capitalize first letters)
    public String formatEmployeeName() {
        String[] words = name.split(" ");
        StringBuilder formattedName = new StringBuilder();
        
        for (String word : words) {
            formattedName.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1).toLowerCase()).append(" ");
        }
        return formattedName.toString().trim();
    }
    
    // Method to generate an email based on the employee's name
    public String generateEmail() {
        String[] parts = name.split(" ");
        String firstName = parts[0].toLowerCase();
        String lastName = parts.length > 1 ? parts[1].toLowerCase() : "";
        return firstName.charAt(0) + lastName + "@example.com";
    }
    
    // Getter method for name
    public String getName() {
        return name;
    }
    
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
}

class empemail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of employees from the user
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline character
        
        // Create an array of Employee objects
        Employee[] employees = new Employee[n];
        
        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            employees[i] = new Employee(name);
        }
        
        // Process and display employee details
        for (int i = 0; i < n; i++) {
            Employee emp = employees[i];
            System.out.println("Original Name: " + emp.getName());
            System.out.println("Formatted Name: " + emp.formatEmployeeName());
            System.out.println("Generated Email: " + emp.generateEmail());
            System.out.println();
        }
    }
}


