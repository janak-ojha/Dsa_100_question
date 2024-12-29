package String;

import java.util.Scanner;

public class Getting_letter {
    static void get(String s){
        s= s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z]", "");
       for(int i=0;i<s.length();i++){
             System.out.print(s.charAt(i));
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        get(s);
    }
}
