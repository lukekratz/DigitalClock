import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // A program that converts the number of seconds in a day into a time, and can convert
        // the time into the number of seconds. The problem involves converting the
        // time given in String format into separate strings of hours, minutes and times.
        Time time = new Time();
        time.readInput();
        System.out.println("The total number of seconds for " + time);
        String seconds = time.getSeconds();
        String minutes = time.getMinutes();
        String hours = time.getHours();
        time.writeNumberOfSeconds(seconds, minutes, hours);
    }
}