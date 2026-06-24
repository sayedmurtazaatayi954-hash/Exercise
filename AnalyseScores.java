
package analysescores;

import java.util.Scanner;

public class AnalyseScores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Initialize variables to store the total sum of scores, count of positive scores, and count of negative scores
        int totalSum = 0;
        int countPositiveScores = 0;
        int countNegativeScores = 0;
        // Read scores until a negative number is entered
      while (true) {
           int score = input.nextInt();
            if (score < 0) {
                break; // Exit the loop when a negative number is read
            }

            totalSum += score;
            countPositiveScores++; // Increment count for positive scores

            // Continue reading until a negative number is read
        }

        // Calculate the average of the scores
        double average = (double) totalSum / countPositiveScores;

        // Display the results
        System.out.println("Total sum of scores: " + totalSum);
        System.out.println("Count of positive scores: " + countPositiveScores);
        System.out.println("Average score: " + average);

        // Determine how many scores are above or equal to the average and how many are below the average
        int countAboveOrEqual = 0;
        int countBelowAverage = 0;
        for (int i = 1; i <= 100; i++) {
            if (i >= average) {
                countAboveOrEqual++;
            } else if (i < average) {
                countBelowAverage++;
            }
        }

        System.out.println("Count of scores above or equal to the average: " + countAboveOrEqual);
        System.out.println("Count of scores below the average: " + countBelowAverage);
  



    }
    
}
