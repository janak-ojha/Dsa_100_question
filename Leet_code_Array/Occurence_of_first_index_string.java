package Leet_code_Array;

public class Occurence_of_first_index_string {
    static int occ(String haystack , String needle)
    {
        int hlen = haystack.length();
        int nlen = needle.length();
        //acording to question
        if(nlen == 0)
        {
            return 0;
        }
        
        for(int i=0;i< hlen-nlen ; i++)
        {
            int j;
            for(j=0;j<nlen;j++)
            {
                if(haystack.charAt(i+j) != needle.charAt(j))
                {
                    break;
                }
            }
            if(j==nlen)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "janak";
        String needle = "nak";
        System.out.println(occ(haystack, needle));
        
    }
    
}
