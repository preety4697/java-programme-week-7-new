package homework_week_7;

import java.util.Scanner;

/**
 * Here's a simple Java program to check if an entered number is
 * "POSITIVE," "NEGATIVE," or "zero":
 */
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        double number = input.nextDouble();

        if (number > 0){
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        }else {
            System.out.println("zero");
        }
        input.close();
    }
}
