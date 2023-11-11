public class Clock {
    int hour,minute;
    Clock(int hour,int minute){
        if(hour<=23 && 0<hour && 0<minute && minute<60){
            this.hour = hour;
            this.minute = minute;

        }
    }
    void addMinute(){
        if(minute<59){
            if(hour<23){
                hour++;
                minute = 0;
            }
            else{
                hour = 0;
                minute= 0;
            }
        }
        else{
            minute++;
        }
    }
}
