package homework_week_7;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme_8_PrintCityName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet (A to F): ");
        char input = scan.next().charAt(0);
        scan.close();

        if (input == 'A') {
            System.out.println("City :  Amsterdam");
        }
        else if (input == 'B') {
            System.out.println("City : Berlin");
        }
        else if (input == 'C') {
            System.out.println("City : Copenhagen");
        }
        else if (input == 'D') {
            System.out.println("City : Dublin");
        }
        else if (input == 'E') {
            System.out.println("City : Edinburgh");
        }
        else if (input == 'F') {
            System.out.println("City : Florence");
        } else {
            System.out.println("Invalid entry, please enter an alphabet from A to F.");
        }
    }
}



