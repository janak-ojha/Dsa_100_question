package Array;

public class Duplicat_elemet_in {
    static void duplicate(int arr[])
    {
      
        int count =0;
        for(int i=0;i<arr.length;i++)
        { boolean isDuplicate = false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                { if(!isDuplicate)
                    {
                    System.out.println("duplicate: "+arr[i]);
                    count++;
                    isDuplicate=true;
                    }
                    

                }
               
                
                
                
            }
           
            
        }
       
        System.out.println("total suplictt are :"+count);
      
    }
    

    public static void main(String[] args) {
        int arr [] = {1,3,3,2,3,3,3,5};
        duplicate(arr);


        
    }
    
}
