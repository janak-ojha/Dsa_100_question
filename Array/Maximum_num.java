package Array;
public class Maximum_num{
    static void max(int arr[])
    {
        int m=arr[0];
        for(int i=1;i<arr.length;i++)
        {           
            if(arr[i]>m)
            {
                m=arr[i];
            }
        }
        System.out.println(m);
    }
    public static void main(String[] args) {
        int arr[]={1,2,13,4,5}; 
        max(arr);             
    }
    
}
