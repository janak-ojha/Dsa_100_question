package Leet_code_Array;

public class Integer_to_roma {
    static String ro_tos(int num)
    {
        int values[] ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String symbols[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder jk = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(num >= values[i])
            {
                num -=values[i];
                jk.append(symbols[i]);;


            }
        }
        return jk.toString();
    }
    public static void main(String[] args) {
        int num =58;
         System.out.println(ro_tos(num));
        
    }
    
}
