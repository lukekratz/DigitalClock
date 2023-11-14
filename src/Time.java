import java.util.Scanner;

public class Time {
    private String seconds;
    private String minutes;
    private String hours;
    private int totalSeconds;

    public Time(){
        seconds = "0";
        minutes = "0";
        hours = "0";
    }

    public Time(String hours){
        setTime("0", "0", hours);
    }

    public Time(String seconds, String minutes, String hours){
        setTime(seconds, minutes, hours);
    }

    public void setTime(String seconds, String minutes, String hours){
        if (timeOK(seconds, minutes, hours)){
            this.seconds = seconds;
            this.minutes = minutes;
            this.hours = hours;
        }
        else{
            System.out.println("Fatal Error.");
            System.exit(0);
        }
    }

    public void setTime(String hours){
        setTime("0", "0", hours);
    }

    public void setSeconds(String seconds){
        this.seconds = seconds;
    }

    public void setMinutes(String minutes){
        this.minutes = minutes;
    }

    public void setHours(String hours){
        this.hours = hours;
    }

    public void setTotalSeconds(int totalSeconds){
        this.totalSeconds = totalSeconds;
    }

    public String getSeconds(){
        return seconds;
    }

    public String getMinutes(){
        return minutes;
    }

    public String getHours(){
        return hours;
    }

    private boolean timeOK(String secondsString, String minutesString, String hoursString){
        int secondsBool = Integer.parseInt(secondsString);
        int minutesBool = Integer.parseInt(minutesString);
        int hoursBool = Integer.parseInt(hoursString);

        return (((secondsBool >= 0) && (secondsBool <= 59)) &&
                ((minutesBool >= 0) && (minutesBool <= 59) &&
                        ((hoursBool >= 0) && (hoursBool <= 23))));
    }

    public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean tryAgain = true;
        while(tryAgain){
            System.out.println("Enter the time.");

            System.out.print("Seconds: ");
            String seconds = keyboard.next();

            System.out.print("Minutes: ");
            String minutes = keyboard.next();

            System.out.print("Hours: ");
            String hours = keyboard.next();

            if (timeOK(seconds, minutes, hours)){
                setTime(seconds, minutes, hours);
                tryAgain = false;
            }
            else
                System.out.println("Illegal time format. Please try again.");
        }

    }

    public void writeNumberOfSeconds(String secondsString, String minutesString, String hoursString){
        int seconds = Integer.parseInt(secondsString);
        int minutes = Integer.parseInt(minutesString);
        int hours = Integer.parseInt(hoursString);
        totalSeconds = seconds + minutes * 60 + hours * 3600;

        System.out.println("Total Seconds: " + totalSeconds);
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }

}
