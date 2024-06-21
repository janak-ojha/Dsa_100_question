package Search;

public class Linear_search {
    static int binar(int arr[],int x){
        for( int i=0;i<arr.length;i++){
            if(x==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int search =5;
        int result = binar(arr, search);
        if(result!=-1){
            System.out.println("element "+search+"  index  "+result);

        }
      
        
    }
    
}
