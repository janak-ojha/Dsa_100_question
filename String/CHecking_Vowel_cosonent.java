package String;

public class CHecking_Vowel_cosonent {
    static void vow_co(String s){
        int vcount=0;
        int ccount=0;
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
        if(ch == 'a' || ch == 'e' || ch=='i' || ch == '0' || ch == 'u'){
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
        String s ="janakaaaaa";
        vow_co(s);
        
    }
    
}
