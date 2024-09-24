package Leet_code2_two_pointer;

public class two_sum1 {
    static int [] two(int arr[] ,int target)
    {
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] ={2,7,8,11};
        int target = 9;
        int res[] = two(arr, target);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        
    }
    
}
