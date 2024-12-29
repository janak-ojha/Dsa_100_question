public class Arms_trong_num {  
    static boolean arm(int n,int power){  
        int sum=0;  
        int temp=n;  
        while(temp>0) {  
            int digit=temp%10;  
            sum+= pow(digit,power);  
            temp/=10;   
        }  
        return sum == n;    
    }
    static int pow(int base ,int exp)  
    {
        int total=1;  
        for(int i=0;i<exp;i++){  
        total = base*total;   
        }    
        return total;  
    }  
    public static void main(String[] args) {  
        int n=153;   
        int p=3;  
       boolean res = arm(153, 3);   
       if(res)  
       {
        System.out.println("isArmstrong");  
       }
       else{
        System.out.println("not is armstrong");  
       }  
    }  
}
