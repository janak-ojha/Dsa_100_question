package Pattern;

public class Pattern5 {
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
                System.out.print("*");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=0;j<=n;j++)
        {
            for(int i=0;i<=j;i++)
            {
                System.out.print(" ");

            }
            for(int k=5;k>=j;k--)
            {
                System.out.print("*");

            }
            for(int l=4;l>=j;l--)
            {
            System.out.print("*");
            }
            
        
        System.out.println();
    }
}
    public static void main(String[] args) {
        ptr(5);
        
    }
    
}
