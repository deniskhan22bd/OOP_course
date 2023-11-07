package practise6;

import java.util.Objects;

public class Person implements CanHavePizza{
    protected String name;
    protected int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eatPizza(){
        System.out.println("Nice pizza(Person)");
    }

    public void payPizza(int value){
        System.out.println("I paid " + value + " tenge");
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(o.getClass() != this.getClass()) return false;

        Person a = (Person)o; 
        return name.equals(a.name) && age == a.age;
    }

    public String toString(){
        return "Name = " + name + " age = " + age;
    }

    public int hashCode(){
        return Objects.hash(name, age);
    }
}
