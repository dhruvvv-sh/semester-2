public class callingarraysinmethods {
    public static void main(String[] args){
        int arr[]  = {2,3,4,3,4,5,5,6,7};
        sum(arr);
    }
    public static void sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("the sum is:"+sum);
    }
}
