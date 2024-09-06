package Array;

public class Missing_num_sorted_array {
    static int mis(int arr[] , int n)
    {
      int   total_sum =(n*(n+1))/2;
      int actual_sum=0;
      for(int num:arr)
      {
        actual_sum=num+actual_sum;
      }
      System.out.println(actual_sum);
      System.out.println(total_sum);
      return total_sum-actual_sum;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,7,8};
        int n=8;
        System.out.println(mis(arr, n));


        
    }
    
}
