package Pattern;

public class HourglassPattern {
    static void hourglass(int n)
    {
           // Upper part of the hourglass
        for (int i = 0; i < n / 2 + 1; i++) {
            // Print leading spaces
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            System.out.print("*");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the hourglass
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            System.out.print("*");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
}
    }
    public static void main(String[] args) {
        hourglass(5);

    }
    
}

