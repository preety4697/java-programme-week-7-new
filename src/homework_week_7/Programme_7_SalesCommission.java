package homework_week_7;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sales ID: ");
        int salesId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Sellers Name : ");
        String sellerName = sc.nextLine();

        System.out.println("Enter Sales Amount : $");
        double salesAmount = sc.nextDouble();

        System.out.println("Enter Basic Salary : $");
        double basicSalary = sc.nextDouble();

        //Calculate sales commission
        double commission = 0.0;

        if (salesAmount >= 50000){
            commission = 0.35 * salesAmount;
        }else if (salesAmount >= 30000){
            commission = 0.20 * salesAmount;
        } else if (salesAmount >= 20000) {
            commission = 0.10 * salesAmount;
        } else if (salesAmount >= 10000) {
            commission = 0.05 * salesAmount;
        }else {
            commission = 0.02 * salesAmount;
        }

        // Calculate total earnings
        double totalEarnings = basicSalary + commission;

        // Display the calculated values
        System.out.println("\nSales Details for Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Sales Commission: $" + commission);
        System.out.println("Total Earnings: $" + totalEarnings);

        sc.close();


    }
    }


