package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class Common_element_two_array {
    public static ArrayList<Integer> findcomon(int arr1 []  ,int arr2[])
    {
        HashSet<Integer> jk= new HashSet<>();
        for(int element: arr1)
        {
            jk.add(element);
        }

        ArrayList<Integer> common = new ArrayList<>();
        for(int ele: arr2)
        {
            if(jk.contains(ele))
            {
                common.add(ele);
            }
        }
        return common;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = {2,3,4,5,8};
        ArrayList<Integer> jk = findcomon(arr, arr1);
        System.out.println("the common ele aree:" + jk);
        
    }
    
}
