class host{
    int[] arr;
    host(int n){
        arr = new int[n];
    }
    void set(int arr1[]){
        int count = 0;
        for(int i:arr1){
            arr[count] = i;
            count++;
        }
    }
    void display(){
        for(int i:arr){
            System.out.println(i);
        }
    }
    void search(int num){
        int count  = 0;
        for(int i:arr){
            if(i==num){
                System.out.println("found at index:"+count);
            }
            count++;
        }
    }
}
public class IntArr {
    public static void main(String[] args){
        host H1 = new host(5);
        int[] arr1 ={1,2,3,4,5};
        H1.set(arr1);
        H1.display();
        H1.search(4); 
    }
}
