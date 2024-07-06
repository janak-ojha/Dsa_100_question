public class LCM {
    static void lc(int a,int b)
    {
        int max;
        if(a>b)
        {
             max=a;
        }
        else{
            max=b;
        }
        while(true){
        if(max%a==0 && max%b==0)
        {
            System.out.println("lcmn ="+ " "+max);
            break;

        }
        max++;
    }
       
    }
    public static void main(String[] args) {
        int a=10;
        int b=15;
        lc(10, 15);
        
    }
    
}
