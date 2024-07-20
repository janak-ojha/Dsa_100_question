package Recursion;

public class Square_no_using_recursion {
    static int pow(int base,int exponent)
    {
        if(exponent == 0)
        {
            return 1;
        }
        return base*(pow(base, exponent-1));
    }
    public static void main(String[] args) {
        
    }
    
}
