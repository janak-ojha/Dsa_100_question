package Leet_code_Array;

public class Reverse_sentence {
    static String rev(String s)
    {
        s.trim();

        String []  word = s.split("\\s+");

        StringBuilder re= new StringBuilder();
        for(int i=word.length-1;i>=0;i--)
        {
            re.append(word[i]);
            if(i>0)
            {
                re.append(" ");
            }
        }
        return re.toString();
    }
    public static void main(String[] args) {
        String s= "helo how are you";
        String r = rev(s);
        System.out.println(rev(s));
        
    }
    
}
