class merge{
    int arr[];
    merge(int n){
        arr = new int[n];
    }
    void accept(int[] arr1,int[] arr2,int n1,int n2){
        int count = 0;
        for(int i:arr1){
            arr[count] = i;
            count++;
        }
        int countagain=0;
        for(int i:arr2){
            arr[countagain+n1] = i;
            countagain++;
        }
    }
    void display(){
    for(int i:arr){
        System.out.println(i);
    }
    }
}
public class mixer {
    public static void main(String[] args){
        merge num = new merge(6);
        int arr1[] = {1,2,3};
        int arr2[] = {3,4,5};
        num.accept(arr1,arr2,3,3);
        num.display();
    }
    
}
