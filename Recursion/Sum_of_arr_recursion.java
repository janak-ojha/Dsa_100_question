package Recursion;

public class Sum_of_arr_recursion {
    static int sum(int arr[],int idx)
    {
        if(idx == arr.length)
        {
            return 0;
        }
        return arr[idx]+sum(arr, idx+1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,10};
        System.out.println(sum(arr, 0));

        
    }
    
}
