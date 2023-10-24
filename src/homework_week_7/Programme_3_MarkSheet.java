package homework_week_7;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C
 */

import java.util.Scanner;

public class Programme_3_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter roll number: ");
        int rollNo = scanner.nextInt();

        // Input marks for Math, Science and English
        System.out.println("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        System.out.println("Enter Science marks (0-100): ");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100){
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        System.out.println("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;

        }
        //Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;

        //Determine pass or fail
        String result;
        if (percentage >= 35){
            result = "pass";
        }else {
            result = "Fail";
        }

        String  grade;
        if (percentage >= 80){
            grade = "A+";
        }else if (percentage >= 60){
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        }else {
           grade = "C";
        }
        // Display student details and result
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);
        scanner.close();

        //print mark sheet format
        System.out.println("----------------------------------");
        System.out.println("|                                |");
        System.out.println("|          Mark Sheet            |");
        System.out.println("|________________________________|");
        System.out.println("|     Name : "+ name +"                 |");
        System.out.println("|     Roll no : "+rollNo+"                |");
        System.out.println("|________________________________|");
        System.out.println("|     Subjects    :    Marks     |");
        System.out.println("|________________________________|");
        System.out.println("|     Math : "+mathMarks+"                  |");
        System.out.println("|     Science : "+scienceMarks+"               |");
        System.out.println("|     English : "+englishMarks+"               |");
        System.out.println("|________________________________|");
        System.out.println("|     Total : "+totalMarks+"                |");
        System.out.println("|________________________________|");
        System.out.println("|     Percentage : "+percentage+"          |");
        System.out.println("|     Result : "+result+"              |");
        System.out.println("|     Grade  : "+grade+"                |");
        System.out.println("|________________________________|");
    }

    }

