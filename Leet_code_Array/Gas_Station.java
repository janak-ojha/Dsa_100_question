package Leet_code_Array;

public class Gas_Station {
    static int fuel(int gas[] ,int cost[])
    {
        int totaltank=0;
        int currenttank =0;
        int startindex = 0;
        for(int i=0;i<gas.length;i++)
        {
            totaltank += gas[i] - cost[i];
            currenttank += gas[i] - cost[i];
            if(currenttank < 0)
            {
                startindex = i+1;
                currenttank = 0;
            }

        }
        return totaltank>=0 ? startindex:-1 ;
    }
    public static void main(String[] args) {
        int [] gas1 = {1,2,3,4,5};
        int [] cost = {3,4,5,1,2};
        System.out.println(fuel(gas1, cost));
        
    }
    
}
