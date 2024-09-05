package Leet_code_Array;
public class Length_of_last_word {
    static int len(String s)
    {
        int length =0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) == ' ')
            {
                if(length>0)
                {
                    break;
                }
            }
            else{
                length++;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        String s = "janak raj ojhaa";
        System.out.println(len(s));       
    }
}
