

public class MyCalender {
    static int year = 2023;
    static int month = 4;
    static int day = 9;
    static int[] daysInMonth = {31,28,31,30,31,30,31,30,31,30,31,30};
    static int counter = 0;
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static String myDate(){
        return String.format("%s-%s-%s", year, month,day);
    }
    static int days(){
        for(int i = 0;i<month - 1;i++){
            counter += daysInMonth[i];
        }
        return counter+day;
    }
    static String monthName(){
        return months[month-1];
    }

}
