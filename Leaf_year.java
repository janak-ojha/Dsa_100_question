public class Leaf_year {
    static boolean isl(int year)
    {
        if((year%4 == 0 && year %100 !=0) || (year%400 == 0))
        {
            return true;
        }
    
        return false;
    }
    public static void main(String[] args) {
        if(isl(2028))
        {
            System.out.println("is leaf");
        }
        else{
            System.out.println("not leaf year");
        }
        
    }
}
