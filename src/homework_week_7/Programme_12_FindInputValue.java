package homework_week_7;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char inputChar = sc.next().charAt(0);

        if (Character.isDigit(inputChar)){
            System.out.println("Input is a number. ");
        }else if (Character.isLetter(inputChar)){
            System.out.println("Input is an alphabet. ");
        }else {
            System.out.println("Input is a symbol or special character.");
            sc.close();
        }
    }
}
