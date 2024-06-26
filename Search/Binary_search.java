package Search;

public class Binary_search {
    static int binar(int arr[],int element){
        int start=0;
        int end =arr.length-1;
       
        while (start<=end) {
            int mid=(start+end)/2;
            if(element==mid)
            {
                return mid;
            }
            else if(element<mid){
                end =mid-1;
            }
            else{
                start =mid+1;
            }

            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,6};
        int element =4;
        int x= binar(arr, element);
        if(x!=-1){
        System.out.println("searched element is  "+element+"  at in index   "+ x);
        }
        else{
            System.out.println("not found i array");
        }
    }
    
}
