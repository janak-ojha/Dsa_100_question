package String;

public class Occurence_of_char {
    static void occu(char k, String j){
        int count=0;
        for(int i=0;i<j.length();i++)
        {
            if(j.charAt(i) == k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
       char k='j';
       String j ="janakj";
       occu(k, j);
        
    }
    
}
