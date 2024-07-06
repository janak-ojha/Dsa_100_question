public class HCF {
    static int hc(int a,int b)
    {
        int min;
        if(a>b)
        {
            min=b;
        }else{
            min=a;
        }
        while(true){ if(a%min==0 && b%min==0) {
            return min;
            
        }
        min--;
        
    }
    
    }
    public static void main(String[] args) {
      int ans=  hc(36, 12);
      System.out.println(ans);
        
    }
    
}
