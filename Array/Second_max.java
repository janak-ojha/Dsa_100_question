package Array;

public class Second_max {

    static void secmax(int arr[])
    {
        int max= arr[0];
        int sm=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[max]<arr[i])
            { 
               
               sm=arr[max];
               arr[max]=arr[i];
            }
           
        }
        System.out.println(sm);
        

    }
    
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        secmax(arr);
        
        
    }
    
}
