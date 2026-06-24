
package computthehourofweeklyemployee;

public class ComputThehourOfweeklyEmployee {

    public static void main(String[] args) {
      //  Sample data: weekly hours for eight employees
        int[][] weeklyHours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        // Compute the total hours for each employee
        int[] totalHours = new int[weeklyHours.length];

        for (int i = 0; i < weeklyHours.length; i++) {
            int sum = 0;
            for (int j = 0; j < weeklyHours[i].length; j++) {
                sum += weeklyHours[i][j];
            }
            totalHours[i] = sum;
        }

        // Custom comparator to sort in descending order
        Comparator<int[]> reverseOrderComparator = (a, b) -> {
            if (b[0] == a[0]) {
                return 0;
            } else {
                return b[0] - a[0];
            }
        };

        // Sort the employees by their total hours in descending order
        Arrays.sort(totalHours, reverseOrderComparator);

        // Display the sorted list of employees and their total hours
        System.out.println("Employees sorted by total hours:");
        for (int i = 0; i < weeklyHours.length && i < totalHours.length; i++) {
          int employeeId = i;
            String employeeName = "Employee " + employeeId;
            double totalHoursForEmployee = totalHours[i];
            System.out.println(employeeName + ": " + totalHoursForEmployee);
        }

    }
    
}
