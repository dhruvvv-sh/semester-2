import java.util.Scanner;

public class merge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Reading the dimensions of both arrays
        System.out.println("Enter the size of arr1:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the size of arr2:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        // Reading elements for arr1
        System.out.println("Enter elements in arr1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Reading elements for arr2
        System.out.println("Enter elements in arr2:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merging the two arrays into arr3
        int[] arr3 = new int[n + m];

        // Copying arr1 to arr3
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }

        // Copying arr2 to arr3
        for (int i = 0; i < m; i++) {
            arr3[n + i] = arr2[i];
        }

        // Printing the merged array
        System.out.println("The merged array is:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        sc.close();
    }
}
