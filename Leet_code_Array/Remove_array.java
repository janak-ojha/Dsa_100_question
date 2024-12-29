package Leet_code_Array;
public class Remove_array{
    static int remove_element(int arr[],int k){
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != k)
            {
                arr[j++] = arr[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,2,3,2};
        int k=2;
        int res = remove_element(arr, k);
        System.out.println(res);
    }
}
