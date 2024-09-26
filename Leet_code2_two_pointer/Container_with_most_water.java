package Leet_code2_two_pointer;

public class Container_with_most_water {
    static int waterm(int height[])
    {
        int max=0;
        int f=0;
        int l=height.length-1;
        while (f<l) {
            int minheight =0;
            if(height[f]<height[l])
            {
                minheight=height[f];
            }else{
                minheight=height[l];
            }
            int width = l-f;
            int area = minheight * width;
            if(area>max){
                max=area;
            }
            if(height[f]<height[l])
            {
                f++;
            }
            else{
                l--;
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(waterm(arr));
        
    }
    
}
