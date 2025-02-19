class outer{
    private String n = "hello this is from outer class";
    class inner{
        void display(){
            System.out.println(n); // accessing the outer class member from innner
        }
    }
    void innerclass(){ //creating an object from the outer class that points to the inner class
        inner i1 = new inner();
        i1.display();
    }
}
public class nestedclass {
    public static void main(String[] args){
        outer o1 = new outer();
        o1.innerclass();
    }
    
}
