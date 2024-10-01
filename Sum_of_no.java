public class Sum_of_no {
    static int sum(int n)
    {
        if(n>=0 && n<=9 )
        {
            return n;
        }
        return sum(n/10)+ n%10;
    }
    public static void main(String[] args) {
        System.out.println(sum(12345));
        
    }
    
}
