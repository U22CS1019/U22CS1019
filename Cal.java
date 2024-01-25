import java.util.Scanner;

public class Cal{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int x,y, result;
        char operator;
        System.out.print("Enter your first number: ");
        x = input.nextInt();

        System.out.print("Enter the operator:(+-*/): ");
        operator=input.next().charAt(0);

        System.out.print("Enter your second number: ");
        y = input.nextInt();

        if (operator=='+'){
            result = x + y;
            System.out.print(result);
        }
        else if (operator=='-'){
            result = x - y;
            System.out.print(result);
        }
        else if (operator=='*'){
            result = x * y;
            System.out.print(result);
        }
        else if(operator=='/'){
            if (y != 0){
             result = x / y;
            System.out.print(result);
        } 
            else {
            System.out.print("Can't be divided by 0");
            }  
        } 
    }
        
}   

