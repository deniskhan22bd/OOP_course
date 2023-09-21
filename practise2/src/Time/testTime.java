package Time;

public class testTime {
    public static void main(String[] args){
        Time t = new Time(13, 0,0);
        System.out.println("_____________________");
        System.out.println(t.toUniversal());
        System.out.println(t.toStandart());
        System.out.println("_____________________");
        Time t2 = new Time(13, 24 ,33);
        t.add(t2);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandart());
    }

}
