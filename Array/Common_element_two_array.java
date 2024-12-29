package Array;

public class Common_element_two_array {

    static void commoneele(int arr1[],int arr2[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.print(arr1[i]+" ");
                }
               
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {2,3,4,5,5};
        commoneele(arr, arr1);
        
    }
    
}
