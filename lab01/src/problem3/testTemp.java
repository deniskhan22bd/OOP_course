package problem3;

public class testTemp {
    public static void main(String[] args){
        Temperature t = new Temperature(10, 'C');
        System.out.println(t.getInCelsius());
        System.out.println(t.getInFahrenheit());


        Temperature t2 = new Temperature(10);
        System.out.println("\n" + t2.getInCelsius());
        System.out.println(t2.getInFahrenheit());


        Temperature t3 = new Temperature('F');
        System.out.println("\n" + t3.getInCelsius());
        System.out.println(t3.getInFahrenheit());


        Temperature t4 = new Temperature();
        t4.setFields(10, 'C');
        System.out.println("\n" + t4);
    }

}
