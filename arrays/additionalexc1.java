import java.util.Scanner;
public class additionalexc1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("enter the number of elements:");
        int num = sc.nextInt();
        arr = new int[num];
        System.out.println("enter the ele:");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number to be found:");
        int found = sc.nextInt();
        int count = 0;
        for(int i:arr){
            if(found==i){
                System.out.println("element found at index:"+count);
            }
            count++;
        }
    }
}
