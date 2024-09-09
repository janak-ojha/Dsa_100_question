package String;

public class Remove_all_white_apace {
    static String rem(String s)
    {
        StringBuilder sc = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != ' ')
            {
                sc.append(s.charAt(i));
            }
        }
        return sc.toString();
    }
    public static void main(String[] args) {
        String j="hello jana k";
        System.out.println(rem(j));
        
    }
    
}
