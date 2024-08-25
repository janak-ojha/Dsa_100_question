package Leet_code_Array;

public class Multipy_except_self {
    static int [] mul(int arr[])
    {
        int n=arr.length;
        int [] res = new int[n];
        int leftproduct = 1;
        for(int i=0;i<n;i++)
        {
            res[i] = leftproduct;
            leftproduct *= arr[i];
        }
        int rightproduct = 1;
        for(int j=n-1;j>=0;j--)
        {
            res[j] *= rightproduct;
            rightproduct *= arr[j]; 
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
       int res[] = mul(arr);
       for(int i=0;i<res.length;i++)
       {
        System.out.print(res[i]+" ");
       }
       System.out.println();
        
    }
    
}
