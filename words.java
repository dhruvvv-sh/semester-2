public class words {
    public static void main(String[] args){
        String str = "hello this is dhruv";
        String[] words = str.split(" ");
        String reversesentence = "";
        for(String word:words){
            System.out.println(word);
            char[] charArray = word.toCharArray();
            String reverseword = "";
            for(int i=0;i<charArray.length;i++){
                reverseword += charArray[charArray.length-i-1];
            }
            reversesentence += reverseword+" ";
        }
        System.out.println(reversesentence);
    }
}
