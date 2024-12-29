public class Decimal_to_binary {
    static String dec(int decimal)
    {
        if( decimal == 0)
        {
            return "0";
        }
        StringBuilder  binary = new StringBuilder();
        while (decimal>0){
            int remainder = decimal%2;
            binary.append(remainder);
            decimal=decimal/2;
        }
        return  binary.reverse().toString();
    }
    public static void main(String[] args) {
        int decimal=2;
        System.out.println(dec(decimal));
    }   
}
