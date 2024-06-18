package Array;

public class Duplicat_elemet_in {
    static void duplicate(int arr[])
    {
        int f=arr[0];
        boolean isDuplicate = false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("duplicate: "+arr[i]);
                    isDuplicate=true;

                }
                
                
                
            }
           
            
        }
        if(!isDuplicate)
        {
            System.out.println("no duplicate");
        }
      
    }
    

    public static void main(String[] args) {
        int arr [] = {1,2,3,5};
        duplicate(arr);


        
    }
    
}
