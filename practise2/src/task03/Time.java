package task03;

public class Time {
    int hour;
    int minute;
    int second;
    Time(int hour, int minute, int second){
        this.hour = hourCheck(hour);
        this.minute = minuteCheck(minute);
        this.second = secondCheck(second);
    }

    private int hourCheck(int hour){
        if(hour < 24) return hour;
        else{
            System.err.println("Error hour => 24");
            return 0;
        }
    }
    private int minuteCheck(int minute){
        if(minute < 60) return minute;
        else{
            System.err.println("Error minute >= 60");
            return 0;

        } 
    }
    private int secondCheck(int second){
        if(second < 60) return second;
        else{
            System.err.println("Error second >= 60");
            return 0;
        } 
    }


    private String timeCheck(int time){
        if(time < 0){
            time += 12;
            return "" + time;
        };
        if(time < 10) return "0" + time;
        return "" + time;
    }
    public String toUniversal(){
        return timeCheck(hour) + ":" + timeCheck(minute) + ":" + timeCheck(second);
    }
    public String toStandart(){
        if(hour - 12 < 0) return timeCheck(hour - 12) + ":" + timeCheck(minute) + ":" + timeCheck(second) + " AM";
        else return timeCheck(hour - 12) + ":" + timeCheck(minute) + ":" + timeCheck(second) + " PM";
    }



    public void add(Time t){
        hour = hourCheck(hour + t.hour);
        minute = minuteCheck(minute + t.minute);
        second = secondCheck(second + t.second);
    }

}   
