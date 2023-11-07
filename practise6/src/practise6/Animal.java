package practise6;

import java.util.Objects;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(){

    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(o.getClass() != this.getClass()) return false;

        Animal a = (Animal)o; 
        return name.equals(a.name) && age == a.age;
    }

    public String toString(){
        return "Name = " + name + " age = " + age;
    }

    public int hashCode(){
        return Objects.hash(name, age);
    }
}
