public class zad24 {
public static void main(String[] args) {
    int hours = 14;
    int minutes = 27;
    String time = hours + ":" + minutes;
    long minutes_from_midnight = hours*60 + minutes;
    long seconds_from_midnight = hours * 3600 + minutes*60;
    System.out.println("time: " + time);
    System.out.println("minutes from midnight: " + minutes_from_midnight);
    System.out.println("seconds from midnight: " + seconds_from_midnight);



     }

}