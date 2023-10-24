package homework_week_7;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 8, 1, 7, 6, 3};
        System.out.println(" Original Numeric array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array:" + Arrays.toString(numericArray));

        //String Array
        String[] stringArray = {"Apple", "Banana", "Orange", "Grapes", "Cherry"};
        System.out.println("\nOriginal String Array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
