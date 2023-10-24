package homework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use switch) if
 * any other alphabet should be invalid entry
 */
public class Programme_9_PrintCityNameWithSwitch{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet (A to F): ");
        String input = scan.next();
        scan.close();

        if (input.length() == 1) {
            char alphabet = input.charAt(0);

            if (alphabet >= 'A' && alphabet <= 'F') {
                switch (alphabet) {

                    case 'A':
                        System.out.println("City :  Amsterdam");
                        break;
                    case 'B':
                        System.out.println("City : Berlin");
                        break;
                    case 'C':
                        System.out.println("City : Copenhagen");
                        break;
                    case 'D':
                        System.out.println("City : Dublin");
                        break;
                    case 'E':
                        System.out.println("City : Edinburgh");
                        break;
                    case 'F':
                        System.out.println("City : Florence");
                        break;
                }

            } else {
                System.out.println("Invalid entry  please enter an alphabet from 'A' to 'F'");
            }
        }else {
            System.out.println( "Invalid entry  please enter a single alphabet");

            }
        }
    }
