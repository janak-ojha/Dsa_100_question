package Leet_code_Array;
public class Remove_duplicate_i {
    static int remov(int arr[])
    {
        int count = 1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != arr[count-1]){
                arr[count++] = arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5};
        int res = remov(arr);
        System.out.println(res);   
    }
}
