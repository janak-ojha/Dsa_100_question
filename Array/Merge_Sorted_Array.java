package Array;
public class Merge_Sorted_Array {
    static void Merges(int arr1[],int m,int arr2[],int n)
    {
        int merge_s[] = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(j<m && k<n)
        {
            if(arr1[j] < arr2[k])
            {
                merge_s[i++] = arr1[j++];
            }
            else{
                merge_s[i++] = arr2[k++];
            }
        }
        while (j<m) {
            merge_s[i++] = arr1[j++];
        }
        while (k<n){
            merge_s[i++] = arr2[k++];
        }
        for(int l=0;l<(m+n);l++)
        {
            arr1[l] = merge_s[l];
        }
    }
    public static void main(String[] args) {
       
        int arr1[]={1,2,3,0,0,0};
        int m=3;
        int arr2[] = {4,5,6};
        int n= arr2.length;
        Merges(arr1, m, arr2, n);
        
        for(int i =0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
    
}
