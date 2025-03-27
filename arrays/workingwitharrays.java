import java.util.Scanner;
class Student{
    public int rollno;
    public String name;
    Student(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }
}
public class workingwitharrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s[];
        s = new Student[5];
        System.out.println("enter the student details:");
        for(int i=0;i<5;i++){
            System.out.println("enter name:");
            String name = sc.next();
            System.out.println("enter rollno.");
            int rollno = sc.nextInt();
            s[i] = new Student(rollno,name);
        }
        System.out.println("display:");
        for(int i=0;i<5;i++){
            System.out.println("rollno:"+s[i].rollno+" , name :"+s[i].name);
        }
    }
}