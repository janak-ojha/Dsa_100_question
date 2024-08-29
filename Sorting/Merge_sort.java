package Sorting;
// O(nlogn) in each case: For divide it takes : (log_n) and for merging: (n).
public class Merge_sort {
    static void conquer(int arr[], int si , int ei , int mid )
    {
        int merge[] =new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;
        while (idx1<=mid && idx2<=ei) {
            if(arr[idx1]<=arr[idx2]){
                merge[x++] = arr[idx1++];               
            }
            else{
                merge[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merge[x++] = arr[idx1++];            
        }
        while (idx2 <= ei) {
            merge[x++] =arr[idx2++];            
        }
        for(int i=0,j=si;i<merge.length;i++,j++)
        {
            arr[j] =merge[i];
        }
    }
    static void divide(int arr[],int si,int ei)
    {
        if(si<ei)
        {
            int mid = si+(ei-si)/2;
            divide(arr, si, mid);
            divide(arr, mid+1, ei);
            conquer(arr,si,ei,mid);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,6,5,2};
        int n=arr.length;
        divide(arr, 0, n-1);
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }    
}
