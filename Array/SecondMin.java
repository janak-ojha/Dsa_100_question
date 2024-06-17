package Array;

public class SecondMin {
    static void sm(int arr[])
    {
        int min=arr[0];
        int smim=0;
        for(int i=0;i<arr.length;i++)
    {
        if(arr[min]>arr[i])
        {
            smim=arr[min];
            arr[min]=arr[i];
        }
    }
    System.out.println(smim);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        sm(arr);

    }
    
}
