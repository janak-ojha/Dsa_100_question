package String;
public class Reverse_of_String {
    static void revrstr(String j)
    {
        String revr="";
        int count=0;
        for(int i=0;i<j.length();i++)
        {
            char c=j.charAt(i);
            count++;

            revr=c+revr;
        }
        System.out.println(revr); 
        System.out.println("the total char are:"+count);     
        }
    public static void main(String[] args) {
        String j="janak ";     
        revrstr(j);     
    } 
}
