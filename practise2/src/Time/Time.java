package Time;

public class Time {
    int hour;
    int minute;
    int second;
    Time(int hour, int minute, int second){
     if(timeCheck(hour, minute, second)) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
     }
     else System.out.println("Error");
    }
    {
     hour = 0;
     minute = 0;
     second = 0;
    }

    private boolean timeCheck(int hour, int minute, int second){
        return hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60;
    }
    private String check(int time) {
     if(time >= 10) return "" + time;
     else return "0"+time;
    }
    public String toUniversal(){
        return check(hour) + ":" + check(minute) + ":" + check(second);
    }
    public String toStandart(){
        if(hour - 12 < 0) return check(hour) + ":" + check(minute) + ":" + check(second) + " AM";
        else return check(hour - 12) + ":" + check(minute) + ":" + check(second) + " PM";
    }



    public void add(Time t){
        if(timeCheck(hour + t.hour, minute + t.minute, second + t.second)) {
         hour = hour + t.hour;
         minute = minute + t.minute;
         second = second + t.second;
        }
        else System.out.println("Error");
    }

}