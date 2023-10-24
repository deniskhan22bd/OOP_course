package problem2;

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

    public abstract void voice();

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Name: " + name + ", age: " + age;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null) return false;
        if(this.getClass() != o.getClass()) return false;
        
        Animal a = (Animal)o;
        return name.equals(a.name) && age == a.age;
    }

    public int hashCode(){
        return Objects.hash(name, age);
    }
}
    