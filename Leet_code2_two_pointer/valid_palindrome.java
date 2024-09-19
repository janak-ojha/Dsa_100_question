package Leet_code2_two_pointer;

public class valid_palindrome {
    static boolean vlid(String s)
    {
        StringBuilder jk = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(c >='A' && c <= 'Z' )
            {
                c=(char)(c+32);
                //A=65 B=66
                //a=97 b=98
            }
            if((c >= 'a' && c <= 'z') || (c >= '0' && c<='9')){
                jk.append(c);

            }
        }
        String k= jk.toString();
        int f=0;
        boolean valid=true;
        int l= k.length()-1;
        while (f<l) {
            if(k.charAt(f) != k.charAt(l))
            {
                valid=false;
            }
            f++;
            l--;
            
        }
        return valid;
    }
    public static void main(String[] args) {
        String s =  "A man, a plan, a canal: Panama";
        String k="jk 12 35_u";
         boolean  jk=vlid(k);
         if(vlid(s))
         {
            System.out.println("is paline");
         }
         else{
            System.out.println("not bol");
         }
        
    }
    
}
