package Recursion;

public class Recursion_Linear_search {

    //find index
    static int Recursio(int arr[],int target,int idx)
    {
        if(idx >= arr.length){
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return Recursio(arr,target,idx+1);
    }



    //find all index search
    static void find(int arr[] ,int target,int idx)
    {
        if(idx>=arr.length)
        {
            return;
        }
        if(arr[idx] == target)
        {
            System.out.println(idx);
        }
        find(arr, target, idx+1);
    }


    public static void main(String[] args) {
        int arr[]={5,2,5,4,5};
        int target=5;
        int idx=0;
        int jk=Recursio(arr, target, idx);
        
        System.out.println("the target: "+target+" found at idx:"+jk);

        find(arr, target, idx);
        
    }
    
}
