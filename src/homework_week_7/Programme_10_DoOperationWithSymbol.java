package homework_week_7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and
 * ask user to enter their symbol (+, -,  /, *)
 * find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System. in);

        System.out.println("Enter the first number: ");
        double num1 = s.nextDouble();

        System.out.println("Enter second number : ");
        double num2 = s.nextDouble();

        System.out.println("Enter the symbol(+,-,*,/): ");
        char symbol = s.next().charAt(0);

        double result;

        if (symbol=='+'){
            result = num1 + num2;
        }else if (symbol=='-') {
            result = num1 - num2;
        }else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol=='/') {
           if (num2 != 0) {
               result = num1 / num2;
           }else{
               System.out.println("Division by zero is not allowed.");
           result = Double.NaN; //set result to NaN if division by zero is attempted
           }
        }else {
            System.out.println("Invalid symbol. Please use +,-,*,or /.");
            result = Double.NaN; // set result to NaN for an invalid symbol
        }
        if (!Double.isNaN(result)){
            System.out.println("result: " + result);
        }
        //close the scanner
        s.close();
    }

}
