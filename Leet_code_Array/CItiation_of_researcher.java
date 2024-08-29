package Leet_code_Array;
public class CItiation_of_researcher {
    static void bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }     
    static int Citation(int [] arr){
        bubble(arr);
        int h_index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=i+1)     
            {
                h_index= i+1;    
            }
            else{
                break;   
            }    

        }
        return h_index;
    }
    public static void main(String[] args) {
        int arr[] ={3,0,6,1,5};
        System.out.println(Citation(arr));        
    }
    
}
