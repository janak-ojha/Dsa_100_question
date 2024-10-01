package Leet_code2_two_pointer;
public class IsSubequence {
    static boolean sub(String s, String p)
    {
        int Spointer = 0; 
        int TPointer = 0; 
        while (Spointer < s.length() && TPointer < p.length()) {  
            if(s.charAt(Spointer) == p.charAt(TPointer)) 
            {
              Spointer++; 
            }
            TPointer++; 
        }
        return Spointer == s.length();  
    }
    public static void main(String[] args) {
        String s="j"; 
        String p="janakojha"; 
        if(sub(s, p))
        {
            System.out.println("is subsequenc");
        }
        else{
            System.out.println("not subsequence");
        }   
    }   
}
