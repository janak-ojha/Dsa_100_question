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
   
    static void natue(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            System.out.print(i+" ");
            sum=sum+i;
        }
        System.out.println();
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int res=natu(10, 0);
        System.out.println(res);  
        natue(10);     
    }
}