package Array;

public class Smallest_elem {
    static void min(int arr[])
    {
        int min =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[min]>arr[i])
            {
                arr[min]=arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr[] ={0,1,2,3,4,5,6};
        min(arr);
    }
    
}
