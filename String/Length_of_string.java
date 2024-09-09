package String;

public class Length_of_string {
    static void l(String s)
    {
        int count =0;
        for(char c: s.toCharArray())
        {
            count++;
        }
        System.out.println( "the len is "+count);
    }
    static void Str_empty(String s)
    {
        int count = 0;
        for(char c : s.toCharArray())
        {
            count++;    
        }
        if(count == 0)
        {
            System.out.println("string is empty");
        }
    }

  
    public static void main(String[] args) {
        String s="janak ";
        String j="";
        Str_empty(j);
        l(s);
        
    }
    
}
