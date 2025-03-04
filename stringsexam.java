public class stringsexam {
    public static void main(String[] args){
        String s = new String("MIT");
        System.out.println(s);
        char[] ch = {'a','c','b','d','f'};
        String b = new String(ch);
        System.out.println(b);
        System.out.println(s.length());
        System.out.println(b.toUpperCase());
        System.out.println(b.charAt(2));
        b.replace('a','f');
        System.out.println(b);
        String s1="computer";
    	String s2="electronics";
    	System.out.println(s1.compareTo(s2));
        if(s1.compareTo(s2)<0){
            System.out.println("s1 is alphabetically smaller than s2");
        }
        else{
            System.out.println("not");
        }
        System.out.println(s1.concat(s2));

        }    
}
