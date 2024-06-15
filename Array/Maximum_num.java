package Array;

public class Maximum_num{

    static void max(int arr[])
    {
        int m=arr[0];
        for(int i=1;i<arr.length;i++)
        { 
            System.out.println(arr[i]);
            if(arr[m]<arr[i])
            {
                m=arr[i];
            }
            

        }
        System.out.println(m);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        max(arr);

       
        
    }
    
}
