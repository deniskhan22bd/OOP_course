package practise6;

import java.util.Objects;

public class Cat extends Animal implements CanHavePizza{
    private String breed;

    public Cat(){

    }

    public Cat(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public void eatPizza(){
        System.out.println("Good pizza(Cat)");
    }

    public String toString(){
        return super.toString() + " breed = " + breed;
    }

    public boolean equals(Object o){
        if(!super.equals(o)) return false;
        Cat c = (Cat)o;
        return breed.equals(c.breed);
    }

    public int hashCode(){
        return Objects.hash(name, age, breed);
    }
}
