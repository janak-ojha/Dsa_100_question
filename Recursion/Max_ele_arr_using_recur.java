package Recursion;

public class Max_ele_arr_using_recur {
    static int max(int arr[],int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
        int small= max(arr, idx+1);
        return Math.max(arr[idx], small);
    }
    public static void main(String[] args) {
        
    }
    
}
