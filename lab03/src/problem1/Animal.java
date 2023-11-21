package problem1;

import java.util.Objects;

public abstract class Animal implements Moveable{
    protected String name;
    protected int age;

    public Animal(){

    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void sound();

    public void move(){
        System.out.println("move");
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
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
