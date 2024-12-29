package Array;
public class SecondMin {
    static void sm(int arr[])
    {
       int smim;
       int min;
       if(arr[0]<arr[1]){
        min=arr[0]; 
        smim=arr[1]; 
       }
       else{
        min=arr[1]; 
        smim=arr[0];
       }
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
