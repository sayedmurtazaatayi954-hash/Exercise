
package averageofarray;

import java.util.Random;

public class AverageOfArray {

    public static void main(String[] args) {
        // Array to store counts of digits from 0 to 9
        int[] counts = new int[10];

        // Generate 100 random integers between 0 and 9
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(10);
            counts[number]++;
        }

        // Display the counts
        System.out.println("Counts of each digit from 0 to 9:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + counts[i]);
       }

        
    }
    
}
