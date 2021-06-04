package program2;

public class Time {
    private long hour;
    private long minute;
    private long second;
/**Default constructor will use 0 for setTime**/
    public Time() {
        this(0);
    }
/**This constructor takes in 3 long values and will set the new Time created**/
    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
/** This constructor takes in a long value in milliseconds to be used in the setTime method**/
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
    /**Method will use System.CurrentTimeMillis() if elapsedTime is 0,
     * then change the time from milliseconds to a time using remainder**/
    public void setTime(long elapseTime) {
        // if statement determining which time to convert based on user input to the object
        if(elapseTime==0){
          elapseTime = System.currentTimeMillis();
        }
        //takes milliseconds and converts it to seconds
            long totalSeconds = elapseTime / 1000;
        //uses remainder to give us the current seconds using a Time format
            second += totalSeconds % 60;
        //divides again to get minutes and then the remainder for current time from a given point
            long totalMinutes = totalSeconds / 60;
            minute += totalMinutes % 60;
        // does the same with hours, but uses 24 to give us the correct hour from given time
            long totalHours = totalMinutes / 60;
            hour += totalHours % 24;

    }


    @Override
    public String toString (){
        return "Hour: "+hour+" Minute: "+minute+" Second: "+second;
    }

}
