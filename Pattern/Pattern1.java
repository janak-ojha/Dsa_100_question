package Pattern;

public class Pattern1 {
    static void pa(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {

            
            System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int i =5;
        pa(i);
        
    }
    
}
