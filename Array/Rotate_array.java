package Array;
public class Rotate_array {
    public static int[] rotate(int arr[],int j)   
    {
        int n= arr.length;   
        reverse(arr,0,n-1);  
        reverse(arr,0,j-1);  
        reverse(arr,j,n-1);   
        return arr;  
    }
    static void reverse(int arr[] ,int start,int end)
    {   
        while (start<end){  
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;           
        }        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        rotate(arr, k);
        for(int i=0;i<arr.length;i++)   
        {
            System.out.print(arr[i]+" ");   
        }  
        System.out.println();      
    }    
}
