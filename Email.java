public class Email {
    public static void main(String[] args) {
        String s1 = "john doe";  // Assuming "john doe" as input

        // Capitalize the first letter of each word
        String[] words = s1.split(" ");
        StringBuilder capitalizedName = new StringBuilder();
        String email = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            // Capitalize the first letter of each word
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            capitalizedName.append(capitalizedWord).append(" ");
            
            // Construct email: first initial + last name
            if (i == 0) {
                // For the first word (first name), add only the first initial
                email += word.charAt(0);
            } else if (i == words.length - 1) {
                // For the last word (last name), add the entire word
                email += word;
            }
        }

        // Trim any trailing spaces from the name
        System.out.println("Capitalized Name: " + capitalizedName.toString().trim());

        // Display the generated email
        System.out.println("Email: " + email.toLowerCase() + "@email.com");
    }
}

