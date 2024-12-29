package Sorting;
// All case :O(n2)
public class Selection_sort{
    static void selec(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            int min_index=i;
            for( int j=i+1;j<=n-1;j++) 
            if(arr[min_index]>arr[j]) 
            {
              min_index=j;                
            }
            int temp =arr[min_index]; 
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,7,6,2};
        PrinteS(arr);
        selec(arr);
        PrinteS(arr);
    }
    static void PrinteS(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    System.out.println();
    }    
}

