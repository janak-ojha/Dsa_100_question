import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the first num");
        double num1= sc.nextDouble();

        System.out.println("Enter the second num");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation: +,-,*,/");
        char operation = sc.next().charAt(0);
        
        double result;

        switch(operation){
            case '+':
                result = num1+num2;
                System.out.println("the result is "+result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("result is :"+result);
                break;
            case '*':
                 result = num1*num2;
                 System.out.println("result is"+result); 
                 break;
            case '/':
                if(num2 != 0){
                 result = num1/num2;
                 System.out.println("result is"+result);   
                 break;  
                }
                else{
                    System.out.println("error: cannot divide by zero");
                } 
                break;  
        default:
            System.out.println("invalid operation");
            break  ;      
        }
        sc.close();
    }
    
}
