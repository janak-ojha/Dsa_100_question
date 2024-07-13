package Pattern;

public class Pattern2 {
    static void pt2(int n)
    {
        for(int i =0;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("5");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        pt2(n);
        
    }
}
