public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    boolean alarmOn;

    Clock(){
        hour = 0;
        minute = 0;
    }
    Clock(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
    }
    void setClock(int hour,int minute){
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59){
        this.hour = hour;
        this.minute = minute;
        }
        else{
            System.out.println("error");
        }
    }
    void setClock(){
        hour = 0;
        minute = 0;
    }
    void displayTime(){
        System.out.printf("%02d:%02d%n", hour, minute);
    }
    void addOneMinute(){
        if(minute == 60){
            minute = 1;
            hour++;
            if( hour == 24){
                hour = 0;
            }
        }
        else if(minute ==59){
            hour++;
            minute = 0;
            if( hour == 24){
                hour = 0;
            }
        }
        else{
            minute++;
        }
        
    }
    void setAlarm(int hour, int minute){
    if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59){
        this.hour = alarmHour;
        this.minute = alarmMinute;
    }
    else{
        System.out.println("error");
    }
    }
    void checkAlarm() {
        if (hour == alarmHour && minute == alarmMinute) {
            alarmOn = true;
        } else {
            alarmOn = false;
        }
    }
    void runAlarm(){
        if (alarmOn) {
            System.out.println("beep-beep-beep-beep !!");
        } else {
            System.out.println("Alarm is not set.");
        }
    }
}
