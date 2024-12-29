public class Reverse_num {
    static int revr(int num,int result)
    {
        if(num==0)
        {
            return result;
        }
        int reminde=num % 10;
        result=result*10+reminde;
        return revr( num/10,result);
    }    
    public static void main(String[] args) {
      int result=revr(53, 0); 
      System.out.println(result);     
    }
}
