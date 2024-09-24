package Leet_code2_two_pointer;

public class two_sum2 {
    static int [] twotwo(int arr[], int target)
    {
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            int sum = arr[left]+arr[right];
            if(sum == target)
            {
                return new int []{left+1,right+1};
            }
            else if(sum<target)
            {
                left++;
            }
            else{
                right--;
            }
            
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,6};
        int target = 7;
        int res[] = twotwo(arr, target);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();
        
    }
    
}
