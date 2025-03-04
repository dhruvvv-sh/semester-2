public class findcommon {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        for(int i:arr1){
            for(int j:arr2){
                if(i==j){
                    System.out.println(i);
                }
            }
        }
    }
    
}
