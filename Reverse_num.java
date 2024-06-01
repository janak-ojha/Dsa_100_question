public class Reverse_num {
    static int revr(int num,int re)
    {
        if(num==0)
        {
            return re;
        }

        int last_digit=num % 10;
        re=re*10+last_digit;
        return revr( num/10, re);
    }
    
    public static void main(String[] args) {
      int result=   revr(53, 0);
      System.out.println(result);
        
    }
}
