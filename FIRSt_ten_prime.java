public class FIRSt_ten_prime {
    static  boolean isprime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i == 0)
            {
               return false; 
            } 
        }
        return true; 
    }
    public static void main(String[] args) { 
       int n=2; 
       while (n<=20) { 
        if(isprime(n)){ 
            System.out.println(n+" "); 
        } 
        n++; 
       }    
    }
}
