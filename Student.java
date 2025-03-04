import java.util.Scanner;
class STUDENT {
    private String name;
    private Subject[] subjects;
    private int subjectCount;

    // Constructor to initialize the student with a name and the number of subjects
    public STUDENT(String name, int numSubjects) {
        this.name = name;
        this.subjects = new Subject[numSubjects]; // Initialize an array of Subject objects
        this.subjectCount = 0; // Keeps track of how many subjects are added
    }

    // Inner class to represent individual subjects
    class Subject {
        private String subjectName;
        private int marks;

        // Constructor for Subject class
        public Subject(String subjectName, int marks) {
            this.subjectName = subjectName;
            this.marks = marks;
        }

        // Method to display subject details
        public void displaySubjectDetails() {
            System.out.println("Subject: " + subjectName + ", Marks: " + marks);
        }

        // Getter for marks
        public int getMarks() {
            return marks;
        }
    }

    // Method to add a subject for the student
    public void addSubject(String subjectName, int marks) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount] = new Subject(subjectName, marks);
            subjectCount++;
        } else {
            System.out.println("Cannot add more subjects.");
        }
    }

    // Method to display all the subject details of the student
    public void displayAllSubjectDetails() {
        System.out.println("Student: " + name);
        for (int i = 0; i < subjectCount; i++) {
            subjects[i].displaySubjectDetails();
        }
    }

    // Method to calculate total marks
    public int calculateTotalMarks() {
        int total = 0;
        for (int i = 0; i < subjectCount; i++) {
            total += subjects[i].getMarks();
        }
        return total;
    }

    // Method to calculate average marks
    public double calculateAverageMarks() {
        if (subjectCount == 0) {
            return 0;
        }
        return (double) calculateTotalMarks() / subjectCount;
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read student details from user
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        // Create a student object
        STUDENT stud = new STUDENT(name, numSubjects);

        // Add subjects and marks
        for (int i = 0; i < numSubjects; i++) {
            sc.nextLine();  // Consume newline left after nextInt()
            System.out.print("Enter subject name: ");
            String subjectName = sc.nextLine();
            System.out.print("Enter marks for " + subjectName + ": ");
            int marks = sc.nextInt();
            stud.addSubject(subjectName, marks);
        }

        // Display all subject details
        System.out.println("\nStudent and Subject Details:");
        stud.displayAllSubjectDetails();

        // Calculate and display total and average marks
        int totalMarks = stud.calculateTotalMarks();
        double averageMarks = stud.calculateAverageMarks();
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        sc.close();
    }
}

