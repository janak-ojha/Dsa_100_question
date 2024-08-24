package String;
public class Duplicate_char_in_string {
    static void Dupli(String s)
    {
        int count =0;
        for( int i=0;i<s.length();i++)
        {      
            boolean isDuplicate= false;
            for(int j=i+1;j<s.length();j++)
            {
                 if(s.charAt(i)==s.charAt(j))
                 {
                    if(!isDuplicate){
                    System.out.println("duplicate : "+s.charAt(j));
                    count++;
                    isDuplicate=true;
                 }
                } 
            }  
        }
        System.out.println("duplicate char are "+count);
    }
    public static void main(String[] args) {
        String s="janakaaa";
        Dupli(s);
    }   
}
