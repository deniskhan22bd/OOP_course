package problem2;

import java.util.Objects;

public class Dog extends Animal{
    private String breed;

    public Dog(){
        super();
    }

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public void voice(){
        System.out.println("It a dog");
    }

    public String getBreed(){
        return breed;
    }

    public String toString(){
        return super.toString() + ", breed:" + breed;
    }

    public boolean equals(Object o){
        if(!super.equals(o)) return false;
        Dog d = (Dog)o;
        return breed.equals(d.breed);
    }

    public int hashCode(){
        return Objects.hash(name, age, breed);
    }
}
