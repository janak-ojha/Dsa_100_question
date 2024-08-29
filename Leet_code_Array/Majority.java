package Leet_code_Array;
public class Majority {
    static int majority(int arr[])
    {
        for( int i=0;i<arr.length;i++)   
        {
            int m=arr[i];  
            int count = 0;   
            for( int j=0;j<arr.length;j++)   
            {
                if(m == arr[j]){   
                    count++;   
                }   
            }   
            if(count>arr.length/2)   
            {   
                return m;   
            }  
        }  
        return  -1;  
    }
    public static void main(String[] args) {
        int arr[] ={2,2,2,3,3,3,2,};   
        int res = majority(arr);      
        System.out.println(res);       
    }    
}  
