public class Odd_recursion {
    static int oddss(int n,int sum)
    {
        if(n==0)
        {
            return sum;
        }
        if(n%2==0){
        sum=sum+n;
        
        }
        return oddss(n-1, sum);
    }
    public static void main(String[] args) {
        int res = oddss(11, 0);
        System.out.println(res);
    }
}
