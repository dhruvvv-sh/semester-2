import java.util.Scanner;
class Extract{
    String name;
    Extract(String name){
        this.name = name;
    }
    void extractinitials(){
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();
        for(String word : words){
            initials.append(word.charAt(0));
        }
        initials.toString().trim().toUpperCase();
    }
    void removeWhitespace(){
        name=name.replaceAll("//s+","");
        System.out.println("the name :"+name);
    }

}
public class Student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students:");
        int num = sc.nextInt();
        Extract[] students = new Extract[num];
        System.out.println("enter the student name:");
        for(int i=0;i<students.length;i++){
            String name = sc.nextLine();
            students[i] = new Extract(name);
        }
        for(Extract student : students){
            
        }

        
    }
    
}
