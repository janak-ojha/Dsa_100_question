package Leet_code_Array;

public class Best_time_to_buy_and_sell_1 {
    static int sell(int arr[])
    {
        if(arr == null && arr.length == 0){
            return 0;
        }
        int maxprofit = 0;
        int minprice = arr[0];
        for(int j=0;j<arr.length;j++)
            {
            if(arr[j]<minprice){
                minprice = arr[j];
                }
            else{
                    int profit = arr[j] - minprice;
                    if(profit>maxprofit)
                    {
                        maxprofit = profit;
                    }
                }
            
            }
            return maxprofit;
           
      
    }
    public static void main(String[] args) {
        int arr[]={6,7,4,6,5,9};
        int res =sell(arr);
        System.out.println(res);
        
    }
    
}
