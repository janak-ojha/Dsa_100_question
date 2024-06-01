public class first_10_natural_recursion {
    static int natu(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        sum=sum+n;
       
         return natu(n-1, sum);
    }
    public static void main(String[] args) {
        int res=natu(10, 0);
        System.out.println(res);
        
    }
}
