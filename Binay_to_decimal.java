import java.util.Scanner;

public class Binay_to_decimal {
    static int binary(int n)
    {
       
        int decimal=0;
        int pow=1;
        int tem=n;
        while (tem>0) {
            int unit_digit=tem%10;
            decimal += unit_digit*pow;
            tem=tem/10;
            pow=pow*2;
            
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(binary(100));
        
    }
    
}
