package homework_week_7;

/**
 * 18. Write a Java program to sum values of an array.
 */

public class Programme_18_SumOfArray {
    public static void main(String[] args) {
        // Initialize array
        int [] numbers = { 5, 10, 15, 20, 25};//
        int sum = 0;

        // Iterate through the array and add each element to the sum
        for (int number : numbers){
            sum +=  number;

        }
        // Print the sum
        System.out.println("the sum of the array elements is :  " + sum);

    }

}
