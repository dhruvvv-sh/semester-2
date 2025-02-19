/*Implement an EMPLOYEE class with an inner class named Department that handles
department-related details. The inner class Department should:
a. Contain fields for departmentName and location.
b. Provide methods to set and display department details.
The EMPLOYEE class should:
Contain fields for eName (employee name), salary, and an array of Department objects.
Provide methods to:
c) Add departments.
d) Display employee details along with department information*/
import java.util.Scanner;
class EMPLOYEE{
    Scanner sc = new Scanner(System.in);
    private static String company = "google";
    double salary;

    class Department{
        private String dept;
        private String location;
        private String name;
        void set(String dept,String location,String name){
            this.dept = dept;
            this.location = location;
            this.name = name;
        }
        void display(){
            System.out.println("Company:"+company);
            System.out.println("department:"+dept);
            System.out.println("location:"+location);
            System.out.println("name:"+name);
        }
    }
    void inner(){
        Department D = new Department();
        System.out.println("enter dept name:");
        String n = sc.next();
        System.out.println("enter Location:");
        String Loc = sc.next();
        System.out.println("enter name:");
        String name = sc.next();
        D.set(n,Loc,name);
        D.display();
    }

}
public class dataemployee {
    public static void main(String[] args){
        EMPLOYEE E1 = new EMPLOYEE();
        E1.inner();
    }

}
