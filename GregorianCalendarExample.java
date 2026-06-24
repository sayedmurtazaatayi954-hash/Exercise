package gregoriancalendarexample;

import java.util.GregorianCalendar;

public class GregorianCalendarExample {

    public static void main(String[] args) {

// Display the current year, month, and day
        System.out.println("Current Date:");
        System.out.println("Year: " + GregorianCalendar.getInstance().get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (GregorianCalendar.getInstance().get(GregorianCalendar.MONTH) + 1)); // Month iszero-based, so add 1
        System.out.println("Day of the Month: " + GregorianCalendar.getInstance().get(GregorianCalendar.DAY_OF_MONTH));

        // Set the value to 1234567898765L and display the year, month, and day
        long timeInMillis = 1234567898765L;
        System.out.println("\nDate at " + timeInMillis + " milliseconds:");
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(timeInMillis);
        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (calendar.get(GregorianCalendar.MONTH) + 1)); // Month is zero-based, so add 1
        System.out.println("Day of the Month: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
    
}
