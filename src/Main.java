// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Clock {
private int hours;
private int minutes;
private int seconds;
public Clock(int hours, int minutes, int seconds){
    this.set(hours, minutes, seconds);
}
public void set (int hours, int minutes, int seconds){
    this.hours=hours;
    this.minutes=minutes;
    this.seconds=seconds;

}
    public void next(){
    this.seconds++;
    if(this.seconds==60){
        this.seconds=0;
        this.minutes++;
    }
    if(this.minutes==60){
            this.minutes=0;
            this.hours++;
    }
    }

}