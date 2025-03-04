import java.util.Scanner;
class IntArr{
    Scanner sc = new Scanner(System.in);
    int[] arr;
    int num;
    IntArr(){
        System.out.println("this is constructor");
    }
    IntArr(int n){
        arr = new int[n];
        this.num = n;
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    void display(){
        for(int i=0;i<num;i++){
            System.out.println(arr[i]+"\n");
        }
    }
    void search(int z){
        int found = 0;
        for(int i = 0;i<num;i++){
            if(arr[i] == z){
                System.out.println("found at index:"+i);
                break;
            }
        }
    }
}
public class integerstorage {
    public static void main(String[] args){
        IntArr I1 = new IntArr(3);
        I1.display();
        I1.search(2);
    }
    
}
