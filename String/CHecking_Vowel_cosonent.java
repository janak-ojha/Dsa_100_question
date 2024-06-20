package String;

public class CHecking_Vowel_cosonent {
    static void vow_co(String s){
        int vcount=0;
        int ccount=0;
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i)=='i' || s.charAt(i) == '0' || s.charAt(i) == 'u'){
            vcount =vcount+1;
        }
        else if(s.charAt(i)>='a' && s.charAt(i)<'z'){
            ccount = ccount+1;
        }
        }
        System.out.println("total vowel are:"+vcount);
        System.out.println("total consonent are :"+ccount);
        
    }

    public static void main(String[] args) {
        String s ="janak";
        vow_co(s);
        
    }
    
}
