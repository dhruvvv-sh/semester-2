public class clonearray {
    public static void main(String[] args){
        int arr[] = {1,2,3};
        int clonearray[] = arr.clone();
        System.out.println(arr == clonearray);

        for (int i = 0; i < clonearray.length; i++) {
            System.out.print(clonearray[i] + " ");
        }
    }

    }
    

