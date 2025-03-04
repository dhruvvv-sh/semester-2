public class prg {
    public static void main(String[] args){
        String s1 = "Mangalore";
        char a = s1.charAt(2);
        System.out.println(a);
        String b = s1.replace("M","B");
        System.out.println(b);
        if(s1.equals(b)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
        int comp = s1.compareTo(b);
        System.out.println(comp);
    }
}
