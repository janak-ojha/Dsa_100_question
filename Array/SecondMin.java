package Array;

public class SecondMin {
    static void sm(int arr[])
    {
        // int min=arr[0];
        // int smim=arr[0];
        int min=Integer.MAX_VALUE;
        int smim= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<min)
        {
            smim=min;
            min=arr[i];
        }
        else if(arr[i]<smim && arr[i] != min){
            smim=arr[i];
        }
    }
    System.out.println(smim);
    }
    public static void main(String[] args) {
        int arr[] = {1,10,3,4,5,6};
        sm(arr);

    }
    
}
