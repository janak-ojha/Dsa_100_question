package Sorting;
// Best Case O(n): when array is already sorted when we have to confirm.
// Average Case O(n2): when array is element are in random order.
// Worst Case O(n2): when array is in reverse order.
public class Bubble_sort{
    static void bubb(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            //best case
            boolean flag= false;// best case
            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;//for best case
            }                       
            } 
            //for best case here j loop run only one time
            if(!flag)
            { 
                return;
            } 
        }                 
    } 
    public static void main(String[] args) {
        int arr[]={1,6,3,4,5};
        Printe(arr);
        bubb(arr);
        Printe(arr);       
    }
    static void Printe(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" " );
        }
        System.out.println();
    }    
}

