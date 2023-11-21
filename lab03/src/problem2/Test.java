package problem2;

import java.util.Vector;

public class Test {
    public static void main(String args[]){
        Vector<Moveable> v = new Vector<Moveable>();

        v.add(new Car());
        v.add(new Person());

        for(Moveable a : v){
            a.move();
            if(a instanceof Swimable){
                Swimable a1 = (Swimable)a;
                a1.swim();
            }
        }
    }
}
