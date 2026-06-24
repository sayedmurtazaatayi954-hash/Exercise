
package theindexofsmallestelement;

import java.util.Scanner;

public class TheIndexOfSmallestElement {
public static int indexOfSmallestElement(int []arrray){
     int []array= new int[10];
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        double minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Calculate and display the index of the smallest element using the indexOfSmallestElement method
        int minIndex = indexOfSmallestElement(numbers);
        System.out.println("The index of the minimum number is: " + minIndex);

        scanner.close();



    }
    
}
