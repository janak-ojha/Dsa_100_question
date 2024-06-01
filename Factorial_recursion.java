public class Factorial_recursion {
    static int facto(int n,int fac)
    {
        if(n==0){
            return fac;
        }
        fac=fac*n;
        return facto(n-1, fac);
    }
    public static void main(String[] args) {
       int res = facto(0, 1);
       System.out.println(res);
        
    }
    
}
