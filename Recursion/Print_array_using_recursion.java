package Recursion;

public class Print_array_using_recursion {
    static void rarr(int arr[] , int idx)
    {
        if(idx==arr.length)
        {
            return ;
        }
        System.out.print(arr[idx]);
        rarr(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};
        int idx=0;
        rarr(arr, idx);
        
    }
    
}
