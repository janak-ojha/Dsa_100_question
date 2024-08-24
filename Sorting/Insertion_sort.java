package Sorting;
//same as bubble sort
public class Insertion_sort {
    static void insert(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            int key =arr[i];
            int j= i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;                        
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,4,3,5,2};
        printe(arr);
        System.out.println("before");
        insert(arr);
        printe(arr);
        System.out.println("sfter");
    }
    static void printe(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
}
