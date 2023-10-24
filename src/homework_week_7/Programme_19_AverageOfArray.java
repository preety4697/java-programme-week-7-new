package homework_week_7;

/**
 * 19. Write a Java program to calculate the average value of array elements
 */
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        // Sample array of numeric value
        double[] numericArray ={3.5, 2.0, 1.5, 4.0, 5.5};


       // Calculate the sum of array elements
        double sum = 0;
        for (double num : numericArray){
            sum += num;
        }
        //Calculate the average
        double average = sum / numericArray.length;

        // Print the result
        System.out.println("Array elements: " + java.util.Arrays.toString(numericArray));
        System.out.println("Average: " + average);

    }
}
