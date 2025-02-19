

public class javabasics {
    public static void main(String[] args){
        String s1 = "hello im Test run case 1";
        System.out.println(s1.charAt(3));
        String s2 = "dhruv";
        String s3 = "Dhruv";
        /*if(s2.equals(s3)){
            System.out.println("same name");
        }else{
            System.out.println("not the same word");
        }*/
        if(s2.equalsIgnoreCase(s3)){
            System.out.println("same name");
        }else{
            System.out.println("not the same word");
        }        
}
}
