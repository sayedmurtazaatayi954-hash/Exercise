
package computertax;

import java.util.Scanner;

public class ComputerTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //Constants for filing status
        final int SINGLE_FILER = 0;
        final int MARRIED_JOINT = 1;
        final int MARRIED_SEPARATE = 2;
                 final int HEAD_OF_HOUSEHOLD = 3;

        // Brackets and rates for each filing status
        double[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // Prompt the user to enter the filing status and taxable income
        System.out.print("Enter your filing status (0 for single filer, 1 for married jointly, 2 for married separately, 3 for head of household): ");
        int filingStatus = scanner.nextInt();
        System.out.print("Enter your taxable income: ");        double taxableIncome = scanner.nextDouble();

        // Compute the tax
        double tax = computeTax(brackets, rates, filingStatus, taxableIncome);

        // Print the result
        System.out.printf("Your tax is $%.2f%n", tax);
    }

    // Method to compute tax based on brackets and rates
    private static double computeTax(double[][] brackets, double[] rates, int filingStatus, double taxableIncome) {
        if (filingStatus < 0 || filingStatus > 3) {
            throw new IllegalArgumentException("Invalid filing status");
        }

        double tax = 0;
        for (int i = 0; i < brackets.length; i++) {
            if (taxableIncome <= brackets[i][0]) {
                // Apply the first bracket
                tax += taxableIncome * rates[i];
                break;
            } else if (taxableIncome > brackets[i][0] && taxableIncome <= brackets[i][1]) {
                // Apply the second bracket
                tax += (brackets[i][1] - brackets[i][0]) * rates[i];
                taxableIncome -= brackets[i][1];
            } else if (taxableIncome > brackets[i][1] && taxableIncome <= brackets[i][2]) {
                // Apply the third bracket
                tax += (brackets[i][2] - brackets[i][1]) * rates[i];
                taxableIncome -= brackets[i][2];
            } else if (taxableIncome > brackets[i][2] && taxableIncome <= brackets[i][3]) {
                // Apply the fourth bracket
                tax += (brackets[i][3] - brackets[i][2]) * rates[i];
                taxableIncome -= brackets[i][3];
            } else if (taxableIncome > brackets[i][3] && taxableIncome <= brackets[i][4]) {
                // Apply the fifth bracket
                tax += (brackets[i][4] - brackets[i][3]) * rates[i];
                taxableIncome -= brackets[i][4];
            } else {
                // Apply the sixth bracket
                tax += (taxableIncome - brackets[i][4]) * rates[i];
                break;
            }
        }

        return tax;
    


    }
    
}
