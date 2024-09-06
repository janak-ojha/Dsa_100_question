public class Perfect_num {

    static void perfect(int num)
    {
        int sumofdivisor=0;
        for( int i=1;i<num;i++)
        {
            if(num%i == 0)
            {
                sumofdivisor +=i;
            }
        }
        System.out.println(sumofdivisor);
        if(sumofdivisor == num)
        {
            System.out.println("is perfect num");
        }
        else{
            System.out.println("is not perfect");
        }
    }
    public static void main(String[] args) {
        int num =6;
        perfect(num);
        
    }
    
}
