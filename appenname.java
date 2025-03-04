public class appenname {
    public static void main(String[] args){
        String str = "dhruv sharma";
        StringBuilder Name = new StringBuilder();
        String[] words = str.split(" ");
        for(String word:words){
            String CapitalizedName = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            Name.append(CapitalizedName).append(" ");
        }
        System.out.println(Name);
    }
    
}
