package Array;
public class Reverse_of_array {
    static void revr(int[] arr)
    {
        int start=0;  
        int end=arr.length-1;  
        while (start<end) {    
            int temp=arr[start];  
            arr[start]=arr[end];   
            arr[end]=temp;   
            start++;   
            end--;    
    }           
        }        
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};  
        for(int i=0;i<arr.length;i++)  
        {
            System.out.print(arr[i]+" ");  
        }
        System.out.println();   
        revr(arr);  
        for(int i=0;i<arr.length;i++)  
        {
            System.out.print(arr[i]+" ");  
        }
        System.out.println();  
    }    
}
