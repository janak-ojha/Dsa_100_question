package Pattern;

public class Pattern3 {
    static void pat(int n)
    {
      for(int i=0;i<=n;i++){
        for(int j=0;j<=n-i;j++)
        {
            System.out.print(" ");

        }
        for(int k=0;k<=i;k++)
        {
            System.out.print("*");
        }
        System.out.println();

      }
}
    
    public static void main(String[] args) {
        pat(5);
        
    }
    
}
