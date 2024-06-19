package Array;

public class Check_array_isSorted {
    static void isSorted(int arr[])
    
    {
        boolean ascending = false;
        boolean descending = false;
        for(int i=0;i<arr.length-1;i++)
        {
            
            if(arr[i]<arr[i+1])
            {
                ascending=true;
               
            }
            if(arr[i]>arr[i+1])
            {
                descending = true;
            }
        }
        if(ascending){
            System.out.println("sorted asscendingly");
        }
        if(descending){
            System.out.println("sorted descendngly");
        }
       
    }
    public static void main(String[] args) {
        int arr[]={111,12,8,7,1};
        isSorted(arr);
    }
    
}
