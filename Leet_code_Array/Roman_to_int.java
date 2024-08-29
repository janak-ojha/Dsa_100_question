package Leet_code_Array;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_int {
    static int rs(String s)
    {
        Map<Character,Integer> romap = new HashMap<>();
        romap.put('I',1);
        romap.put('V',5);
        romap.put('X',10);
        romap.put('L',50);
        romap.put('C',100);
        romap.put('D',500);
        romap.put('M', 100);
        
        int total =0;
        int n = s.length();
        for( int i=0;i<n;i++)
        {
            int currentval = romap.get(s.charAt(i));
            if(i<n-1 && currentval < romap.get(s.charAt(i+1))){
                total -= currentval;
            }
            else{
                total += currentval;
            }
        }
        return total;

    }
    public static void main(String[] args) {
        String s = "IX";
        System.out.println(rs(s));
        
    }
    
}
