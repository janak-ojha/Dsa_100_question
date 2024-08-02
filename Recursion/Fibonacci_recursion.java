package Recursion;

public class Fibonacci_recursion {
    static int fb(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if( n==1)
        {
            return 1;
        }
        return fb(n-1)+fb(n-2);
        
    }
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++)
        System.out.println(fb(i));
        
        
    }
    
}
