import java.util.Scanner;

class Student {
    private String name;
    // Constructor to initialize the student with name
    public Student(String name) {
        this.name = name;
    }
    // Method to extract initials from the student's name
    public String extractInitials() {
        String initials = "";
        boolean nextInitial = true;
        for (int i = 0; i < name.length(); i++) {
            if (nextInitial && Character.isLetter(name.charAt(i))) {
                initials += Character.toUpperCase(name.charAt(i));
                nextInitial = false;
            }
            if (name.charAt(i) == ' ') {
                nextInitial = true;
            }
        }
        return initials;
    }
    // Method to remove whitespace characters from the student's name
    public String removeWhitespace() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isWhitespace(name.charAt(i))) {
                result.append(name.charAt(i));
            }
        }
        return result.toString();
    }
    // Getter for the student's name
    public String getName() {
        return name;
    }
    // Setter for the student's name
    public void setName(String name) {
        this.name = name;
    }
    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
    }
}
public class StudentMain {
    // Method to list all students with a particular substring in their name
    static void listStudentsWithSubstring(Student[] students, String substring) {
        System.out.println("\nStudents containing '" + substring + "' in their name:");
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(substring.toLowerCase())) {
                student.displayStudentDetails();
            }
        }
    }
    // Method to sort students alphabetically by name using basic string comparison
    static void sortStudentsAlphabetically(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getName().compareToIgnoreCase(students[j].getName()) > 0) {
                    // Swap students
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Asking the user for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        // Create an array of Student objects
        Student[] students = new Student[numStudents];
        // Reading student details and initializing the array
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            students[i] = new Student(name);
        }
        // Display details of all students
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.displayStudentDetails();
        }
        // Illustrating the use of the extractInitials() and removeWhitespace() methods
        System.out.println("\nExtracted Initials and Names without Whitespace:");
        for (Student student : students) {
            String initials = student.extractInitials();
            String nameWithoutWhitespace = student.removeWhitespace();
            System.out.println("Original Name: " + student.getName());
            System.out.println("Initials: " + initials);
            System.out.println("Name without Whitespace: " + nameWithoutWhitespace + "\n");
        }
        // Asking the user for a substring to search for in student names
        System.out.print("Enter a substring to search for in student names: ");
        String substring = sc.nextLine();
        listStudentsWithSubstring(students, substring);
        // Sorting students alphabetically and displaying them
        sortStudentsAlphabetically(students);
        System.out.println("\nSorted Students Alphabetically:");
        for (Student student : students) {
            student.displayStudentDetails();
        }
        sc.close();
    }
}

