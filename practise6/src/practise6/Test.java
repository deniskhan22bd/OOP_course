package practise6;

public class Test {
    public static void main(String args[]){
        Restoraunt delpapa = new Restoraunt("delpapa");
        System.out.println(delpapa);


        delpapa.servePizza(new Cat());
        delpapa.servePizza(new Person());
        delpapa.servePizza(new Student());
    }
}
