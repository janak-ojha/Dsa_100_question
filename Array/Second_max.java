package Array;

public class Second_max {

    static void secmax(int arr[])
    {
     
     int max;
     int sm;
     if(arr[0]>arr[1]){
        max= arr[0];
        sm = arr[1];
     }
     else{
        max=arr[1];
        sm=arr[0];
     }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            { 
               
               sm=max;
               max=arr[i];
            }
            else if(arr[i]>sm && arr[i]!=max){
                sm=arr[i];
            }
           
        }
        System.out.println(sm);
        

    }
    
    public static void main(String[] args) {
        int arr[] ={9,8,2,5,7,8};
        secmax(arr);
        
        
    }
    
}
