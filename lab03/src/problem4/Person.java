package problem4;

import java.util.Objects;

public class Person {
    protected String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return name; 
    }
    
    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(o.getClass() != this.getClass()) return false;
        Person p = (Person)o;

        return name.equals(p.name);
    }

    public int hashCode(){
        return Objects.hash(name);
    }
}
