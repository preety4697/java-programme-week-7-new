package homework_week_7;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Programme_20_FindValueInArray {
    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {3, 6, 9, 12, 15};

        //Value to search for
        int targetValue = 3;

        // Initialize a flag to indicate whether the value is found
        boolean found = false;

        // Iterate through the array to check for the target value
        for (int number : numbers) {
            if (number == targetValue) {
                found = true;
                break;// exit the loop once the value is found

            }
        }

        // Check the value was found and print the result
         if (found) {
             System.out.println("The array contains the value  " + targetValue + " .");
         }else {
             System.out.println("The array does not contains the value " + targetValue + ".");

         }


    }


}



