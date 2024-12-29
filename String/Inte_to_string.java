package String;

import java.util.Scanner;

public class Inte_to_string {

    // Function to convert integer to string and check the conversion
    public static void jk() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Convert integer to string
        String s = String.valueOf(n);
        
        // Check if conversion is successful
        if (n == Integer.parseInt(s)) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        jk(); // Call the jk method
    }
}
