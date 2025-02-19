class outer{
    private static String university = "MIT";
    static class inner{
        private int rollnumber;
        private String name;
        inner(int rollnumber,String name){
            this.rollnumber = rollnumber;
            this.name = name;
        }
        void display(){
            System.out.println("University:"+university);
            System.out.println("Name:"+name);
            System.out.println("RollNumber:"+rollnumber);
        }
    }
}
public class university {
    public static void main(String[] args){
        outer.inner ob1 = new outer.inner(2409,"Dhruv");
        ob1.display();
    }
}
