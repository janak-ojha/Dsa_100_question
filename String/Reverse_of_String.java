package String;
public class Reverse_of_String {
    static void revrstr(String j)
    {
        String revr="";
        for(int i=0;i<j.length();i++)
        {
            char c=j.charAt(i);
            revr=c+revr;
        }
        System.out.println(revr);      
        }
    public static void main(String[] args) {
        String j="janak";     
        revrstr(j);     
    } 
}
