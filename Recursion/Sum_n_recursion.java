package Recursion;
public class Sum_n_recursion {
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int su=sum(10);
        System.out.println(su);        
    }    
}
