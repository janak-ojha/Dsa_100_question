package Array;
public class Palindrome_aray {
    static void palin(int arr[])
    {  boolean p = true;
        int f=0;
        int l= arr.length-1;
        while (f<=l) {
            if(arr[f] != arr[l])  
            {
                p=false;  
            }
            f++;   
            l--;         
        }     
        if(p)
        {
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,3,2,1};
        palin(arr);
    }  
}
