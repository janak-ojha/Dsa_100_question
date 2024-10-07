package Recursion;

public class Recursion_on_string {

    // removing target element from string
    static void str(String s,char target,int idx)
    {
        if(idx >= s.length())
        {
            return;
        }
        if(s.charAt(idx) != target)
        {
            System.out.print(s.charAt(idx));
        }
        str(s, target, idx+1);
    }

    // reverse of string using recurssion
    static String rev(String s ,int idx)
    {
        if((idx) == s.length())
        {
            return "";
        }
        
        return rev(s, idx+1)+s.charAt(idx);
    }

    // palindrome checking using recurssion
    static boolean palindrome(String s,int f,int e)
    {
        if(f>=e)
        {
            return true;
        }
         return s.charAt(f) == s.charAt(e)  && palindrome(s, f+1, e-1);
    }
    public static void main(String[] args) {
        String s="janak";
        char target = 'a';
        int idx=0;
        int jko=0;
        int f=0;
        int l=s.length()-1;
        String pal="ojaajo";
        
        //1st
        str(s, target, idx);
        System.out.println();

        // reverse
        String jk = rev(s, jko);
        System.out.print(jk);
        System.out.println();
        
        // palindeome
        boolean jker= palindrome(pal,f,l);
        if(jker)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        
    }
    
}
