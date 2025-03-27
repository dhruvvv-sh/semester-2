import java.util.Scanner;

class Student {
    private String name;
    
    // Constructor to initialize the Student object
    public Student(String name) {
        this.name = name;
    }
    
    // Method to extract initials from the student's name
    public String extractInitials() {
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String word : words) {
            initials.append(Character.toUpperCase(word.charAt(0)));
        }
        return initials.toString();
    }
    
    // Method to remove whitespaces from the student's name
    public String removeWhitespace() {
        return name.replaceAll("\\s", "");
    }
    
    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

class stringarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of students from the user
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline character

        // Create an array of Student objects
        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            students[i] = new Student(name);
        }

        // Process and display student details
        for (int i = 0; i < n; i++) {
            Student stu = students[i];
            System.out.println("Original Name: " + stu.getName());
            System.out.println("Initials: " + stu.extractInitials());
            System.out.println("Name without Whitespace: " + stu.removeWhitespace());
            System.out.println();
        }

        // Searching for a substring in student names
        System.out.print("Enter a substring to search in student names: ");
        String substring = scanner.nextLine().toLowerCase();
        System.out.println("Students containing \"" + substring + "\":");
        for (int i = 0; i < n; i++) {
            if (students[i].getName().toLowerCase().contains(substring)) {
                System.out.println(students[i].getName());
            }
        }

        // Sorting the students alphabetically
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getName().compareToIgnoreCase(students[j].getName()) > 0) {
                    // Swap the student names
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        // Display sorted list
        System.out.println("\nSorted Student Names:");
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].getName());
        }
    }
}
