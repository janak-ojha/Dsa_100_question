public class Count_Frequency_no_in_num {
    static int fre(int num)
    { int count=0;
        int temp = num;
        while (temp!=0) {
            temp /=10;
            count++;  
        }
        return count;

    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(fre(n));
        
    }
    
}
