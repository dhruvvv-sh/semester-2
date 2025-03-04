public class countvowels {
    public static void main(String[] args) {
        String str = "abcdef";
        char[] charArray = str.toCharArray();
        int count = 0;
        
        for (char i : charArray) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                count++;
            }
        }
        
        System.out.println("Vowel count: " + count);
    }
}
