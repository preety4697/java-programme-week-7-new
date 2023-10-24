package homework_week_7;
/**
 *  WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 */

import java.util.Scanner;

public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        //Calculate HRA, TA, DA, PF, and Gross Salary
        double hra = 0.10 * basicSalary;
        double da = 0.08 * basicSalary;
        double ta = 0.09 * basicSalary;
        double pf = 0.20 * basicSalary;
        double grossSalary = basicSalary + hra + ta + da -pf;

        //Display the calculated values
        System.out.println("\nSalary Details for Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA: $" + hra);
        System.out.println("TA: $" + ta);
        System.out.println("DA: $" + da);
        System.out.println("PF: $" + pf);
        System.out.println("Gross Salary: $" + grossSalary);

        sc.close();
        // Print Salary Slip
        System.out.println("-------------------------------------");
        System.out.println("| Salary Slip                       | ");
        System.out.println("|___________________________________|");
        System.out.println("| Employee Id: "+employeeID+" |                ");
        System.out.println("| Employee Name: "+employeeName+" |               ");
        System.out.println("|___________________________________|");
        System.out.println("| Basic Salary: "+basicSalary+" |            ");
        System.out.println("| HRA 10% : "+hra+" |                 ");
        System.out.println("| TA 8% : "+ta+" |                   ");
        System.out.println("| DA 9% : "+da+" |                   ");
        System.out.println("| PF -20% : "+pf+" |                 ");
        System.out.println("|___________________________________|");
        System.out.println("| Gross Salary: "+grossSalary+" |            ");
        System.out.println("|===================================|");

    }

}
