package Array;

public class Kdnes_algo_max_subarray_sum {
    static int max_sub_array(int arr[]){
        int maxSoFar=arr[0];
        int currentMax=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            currentMax = Math.max(arr[i], currentMax+arr[i]);
            maxSoFar = Math.max(currentMax, maxSoFar);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(max_sub_array(arr));
        
    }
}
