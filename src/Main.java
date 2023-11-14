import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // A program that converts the number of seconds in a day into a time, and can convert
        // the time into the number of seconds. The problem involves converting the
        // time given in String format into separate strings of hours, minutes and times.
        String time;
        int seconds;
        int minutes;
        int hours;
        int totalSeconds;

        // Convert the time into seconds
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the time (hh:mm:ss): ");
        // Obtain the time from the user.
        time = scannerObject.next();

        // Getting the number of seconds
        char tensSecond = time.charAt(6);
        char unitSecond = time.charAt(7);
        String secondString = Character.toString(tensSecond) + Character.toString(unitSecond);
        seconds = Integer.parseInt(secondString);

        // Getting the number of minutes
        char tensMinute = time.charAt(3);
        char unitMinute = time.charAt(4);
        String minuteString = Character.toString(tensMinute) + Character.toString(unitMinute);
        minutes = Integer.parseInt(minuteString);

        // Getting the number of minutes
        char tensHour = time.charAt(0);
        char unitHour = time.charAt(1);
        String hourString = Character.toString(tensHour) + Character.toString(unitHour);
        hours = Integer.parseInt(hourString);

        // Convert the time to the number of seconds
        totalSeconds = seconds + minutes * 60 + hours * 3600;
        System.out.println("The total number of seconds: " + totalSeconds);
    }
}