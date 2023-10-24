package problem2;

import java.util.Objects;

public class Cat extends Animal{
    private String breed;

    public Cat(){
        super();
    }

    public Cat(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public void voice(){
        System.out.println("It a cat");
    }

    public String getBreed(){
        return breed;
    }

    public String toString(){
        return super.toString() + ", breed:" + breed;
    }

    public boolean equals(Object o){
        if(!super.equals(o)) return false;
        Cat d = (Cat)o;
        return breed.equals(d.breed);
    }

    public int hashCode(){
        return Objects.hash(name, age, breed);
    }
}
