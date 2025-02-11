class Student{
    String sname;
    int[] marks = new int[3];
    int total;
    double avg;
    void assign(String x,int marks1,int marks2,int marks3){
        sname = x;
        marks[0] = marks1;
        marks[1] = marks2;
        marks[2]=marks3;
    }
    void display(){
        System.out.println("the student details are:");
        System.out.println("name:"+sname+" mark1:"+marks[0]+" mark2:"+marks[1]+" mark3:"+marks[2]);
    }
    void compute(){
        total = marks[0]+marks[1]+marks[2];
        avg = (double) total/3;
        System.out.println("the total marks are:"+total+" the avg marks are:"+avg);
    }


}
public class Q1 {
    public static void main(String[] args){
    Student S1 = new Student();
    S1.assign("dhruv",23,45,67);
    S1.display();
    S1.compute();
}
}
