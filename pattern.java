public class pattern {
    public static void main(String[] args){
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }System.out.print("\n");
        }
        int[] numbers = {1, 2, 3, 4, 5};

        // Outer loop using for-each
        for (int num : numbers) {
            // Inner loop to print the number 'num' 'num' times
            for (int i = 1; i <= num; i++) {
                System.out.print(num + " ");
            }
            System.out.println();  // Move to the next line after each iteration
    }
}
}
