package String;

public class Remove_all_white_space {
    
    // Method to remove white spaces from the string
    static String rem(String s) {
        StringBuilder sc = new StringBuilder();
        
        // Iterate through each character of the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is not a space
            if (s.charAt(i) != ' ') {
                sc.append(s.charAt(i)); // Append non-space characters to StringBuilder
            }
        }
        
        // Return the final string without spaces
        return sc.toString();
    }
    
    public static void main(String[] args) {
        String j = "hello jana k";
        
        // Calling the rem function and printing the result
        System.out.println(rem(j)); // Output: "hellojanak"
    }
}
