package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 * If we divide any number by number 2 its leave remainder 0  = Even
 * If we divide any number by number 2 its leave remainder 1 = Odd
 */
public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        //12%2 ==> 0==0 Even number
        //15%2 ==> 1==0 Odd number
        String result = number%2==0 ? "Even number" :"Odd number";
        System.out.println(result);
    }
}
