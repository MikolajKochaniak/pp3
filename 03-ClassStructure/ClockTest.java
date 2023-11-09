public class ClockTest {
    public static void main(String[] args) {
        Clock Miki = new Clock();
        Miki.setClock(12,47);
        Miki.displayTime();
        Miki.setClock(18,14);
        Miki.displayTime();
        Miki.setClock(23,58);
        Miki.addOneMinute();
        Miki.displayTime();
        Miki.addOneMinute();
        Miki.displayTime();
        Miki.addOneMinute();
        Miki.displayTime();
        Miki.setAlarm(0, 2);
        Miki.checkAlarm();
        Miki.runAlarm();
    }
}
