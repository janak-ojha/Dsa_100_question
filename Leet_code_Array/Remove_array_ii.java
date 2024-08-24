package Leet_code_Array;

public class Remove_array_ii {
    static int duplicate(int arr[])
    {
        if(arr.length <= 2)
        {
            return arr.length;
        }
        int count =2;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != arr[count-2]){
                arr[count++] = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,4,5};
        int res = duplicate(arr);
        System.out.println(res);
        
    }
    
}
