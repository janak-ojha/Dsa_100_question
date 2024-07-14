package Pattern;

public class Pattern4 {
    static void ptr(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("0");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("0");
            }
            System.out.println();

        }
       
    }
    public static void main(String[] args) {
        ptr(5);
        
    }
    
}
