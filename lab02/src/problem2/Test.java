package problem2;

import java.util.HashSet;

public class Test {
    public static void main(String[] args){
        Dog d = new Dog("Dog1", 10, "Dog");
        Dog d2 = d;
        Dog d3 = new Dog("Dog1", 10, "Dog");
        Dog d4 = new Dog("Dog2", 10, "Dog");
        Cat c = new Cat("Cat1", 15, "Cat");
        Cat c2 = c;
        Cat c3 = new Cat("Cat1", 15, "Cat2");
        HashSet<Animal> h = new HashSet<Animal>();

        h.add(d);
        h.add(d2);
        h.add(d3);
        h.add(d4);
        h.add(c);
        h.add(c2);
        h.add(c3);
        System.out.println(h);

        for(Animal an : h){
            an.voice();
        }
    }
}
