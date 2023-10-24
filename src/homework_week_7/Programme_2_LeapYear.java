package homework_week_7;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out
 *  if it is leap year or not?
 *  A leap year is that divisible by 4 and not  divisible by 100 century year.
 *  (Year ending with 00 is called century year)
 *  Any year that is leap year only it is divisible by 400.
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        int year;
        boolean leap = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year");
        year = scanner.nextInt();
        scanner.close();

        // century (100%=0 and 400%=0) 2000, 2400,     1700, 1800, 1900
        // yearly (100%!=0 and 4%=0) 2020, 2024         2021,2022, 2023
        if (year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
            System.out.println("Leap year");
        }else
            System.out.println("Not a leap year");
    }
}
