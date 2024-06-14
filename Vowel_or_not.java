public class Vowel_or_not {
    static void vow(char x)
    {
        if(x == 'a' || x == 'e' || x=='i' || x=='o' || x=='u')
        {
            System.out.println("vowel");
        }
        else{
            System.out.println("consonent");
        }

    }
    public static void main(String[] args) {
        vow('e');
        
        
    }
    
}
