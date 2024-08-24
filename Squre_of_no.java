public class Squre_of_no {
    static int pow(int base,int exponent)
    {
        int res=1;
        for(int i=0;i<exponent;i++)
        {
            res =res*base;
        }
        return res;
    }
    public static void main(String[] args) {
        int r=pow(2, 3);
        System.out.println(r);       
    }    
}
