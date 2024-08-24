public class Prime_num {
    static boolean ispr(int a)
    {       
        if(a==1)
        {
            return false;
        }
        if(a==2 || a==3)
        {
            return true;
        }
        if(a%2==0 ||  a%3==0)
        {
            return false;
        }
        for(int i=5;i*i<=a;i=i+6)
        {
            if(a%i==0 || a%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }
    static boolean pre(int n)
    {
        for(int i=2;i*i<n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    static boolean pr(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        System.out.println(ispr(24));
        boolean res = ispr(24);
        if(res)
        {
            System.out.println("it is prime");
        }
        else{
            System.out.println("not prime");
        }       
    }    
}
