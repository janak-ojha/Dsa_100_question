package String;

public class Length_of_string {
    static void l(String s)
    {
        int length=0;
       for (int i=0;i<s.length();i++)
       {
    
        length++;
       }
       System.out.println(length); 
    }
    static void Str_empty(String s)
    {
        int count = 0;
        for(char c : s.toCharArray())
        {
            count++;    
        }
        System.out.println( "the len is "+count);
        if(count == 0)
        {
            System.out.println("string is empty");
        }
    }

  
    public static void main(String[] args) {
        String s="janak ";
        String j="janakaka";
        Str_empty(j);
        l(s);
        
    }
    
}
