package Array;

public class Check_array_isSorted {
    static boolean Asend(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            
            if(arr[i]>arr[i+1])
            {
                return false;
            }
           
        }
     return true;
    }

    static boolean Descend(int arr[])
    {
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]<arr[j+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={111,12,8,7,8};
         Asend(arr);
         if(Asend(arr)){
            System.out.println("is Acending");
         }
          else if(Descend(arr)){
            System.out.println("it is descending");
         }else{
            System.out.println("neither descending nor ascending");
         }
    }
    
}
