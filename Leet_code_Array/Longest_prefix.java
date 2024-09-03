package Leet_code_Array;

public class Longest_prefix {
    static String lon(String s [])
    {
        if(s==null || s.length==0)
        {
            return "";
        }
        String prefix = s[0];
        for(int i=1;i<s.length;i++)
        {
            while(s[i].indexOf(prefix) != 0)
            {
              prefix = prefix.substring(0,prefix.length()-1);
              if(prefix.isEmpty())
              {
                return "";
              }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String [] j = {"janak","jan","jan"};
        String s = lon(j);
        System.out.println(s);
        
    }
    
}
