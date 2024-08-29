package Leet_code_Array;
public class BEst_time_to_sell_ii {
    static int best(int arr[]){
        int profit=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                profit = profit+arr[i]-arr[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] ={1,3,5};
        System.out.println(best(arr));
    }
    
}
