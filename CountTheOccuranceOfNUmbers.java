
package counttheoccuranceofnumbers;

import java.util.Scanner;

public class CountTheOccuranceOfNUmbers {

    public static void main(String[] args) {
         Map<Integer, Integer> countMap = new HashMap<>();
         Read integers from the user until 0 is entered
        while (true) {
          int number = input.nextInt();
            if (number == 0) {
                break;
            }
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
            }

        // Display the results in increasing order
       for (int i = 1; i <= 100; i++) {
           if (countMap.containsKey(i)) {
                System.out.println(i + " occurs " + countMap.get(i) + " times");
            }
        }