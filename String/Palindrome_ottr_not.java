package String;
public class Palindrome_ottr_not {
    static void Palindrome(String h)
    { boolean Palindrom=true;
        int f=0; 
        int l=h.length()-1; 
        while (f<l) { 
            if(h.charAt(l)!=h.charAt(f)) 
            {
                Palindrom=false;  
            }
            l--; 
            f++; 
        }
        if(Palindrom) 
        {
            System.out.println("palindrome"); 
        }
        else{ 
        System.out.println("not palindrome"); 
    } 
    } 
    public static void main(String[] args) { 
        String h="1100011"; 
        Palindrome(h); 
    }  
}
