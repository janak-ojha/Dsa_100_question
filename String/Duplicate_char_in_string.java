package String;

public class Duplicate_char_in_string {
    static void Dupli(String s)

    {

        int count =0;
        char [] ch = s.toCharArray();
        boolean[] printed = new boolean[ch.length];
        for( int i=0;i<ch.length;i++)

        {
           
            boolean isDuplicate= false;
            for(int j=i+1;j<ch.length;j++)
            {
                 if(ch[i]==ch[j] && !printed[j])
                 {
                    if(!isDuplicate){
                    System.out.println("duplicate : "+ch[j]);
                    count++;
                    isDuplicate=true;
                 }
                
                }
                 
                
            }
           
        }
        System.out.println("duplicate char are "+count);
    }
    public static void main(String[] args) {
        String s="janakaaaaaaa";
        Dupli(s);
    }
    
}
