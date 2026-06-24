
package printdistanationnumber;

import java.util.Scanner;

public class PrintDistanationNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Initialize an array to store distinct numbers
        int[] distinctNumbers = new int[10];
        int countDistinct = 0;

        // Read the first number
        int num = input.nextInt();
       distinctNumbers[countDistinct++] = num;

        // Read the remaining 9 numbers
       for (int i = 1; i < 10; i++) {
           int currentNum = input.nextInt();

            // Check if the current number is already in the array
            boolean isDuplicate = false;            for (int j = 0; j < countDistinct; j++) {
                if (distinctNumbers[j] == currentNum) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to the array
            if (!isDuplicate) {
                distinctNumbers[countDistinct++] = currentNum;
            }
        }

        // Display the number of distinct numbers and the distinct numbers in their input order
        System.out.println("The number of distinct numbers is " + countDistinct);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < countDistinct; i++) {
            if (i > 0) {
                System.out.print(" "); // Add a space between distinct numbers
            }
            System.out.print(distinctNumbers[i]);
        }


    }
    
}
