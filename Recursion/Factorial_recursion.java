package Recursion;
public class Factorial_recursion {
    static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
      int res =  fact(5);
      System.out.println(res);        
    }
    
}
