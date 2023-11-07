package practise6;

import java.util.Objects;

public class Student extends Person{
    private int id;
    public Student(){

    }

    public Student(String name, int age, int id){
        super(name, age);
        this.id = id;
    }

    public void eatPizza(){
        System.out.println("Best pizza(Student)");
    }

    public void payPizza(int value){
        System.out.println("I dont have " + value + " tenge");
    }

    public String toString(){
        return super.toString() + " id = " + id;
    }

    public boolean equals(Object o){
        if(!super.equals(o)) return false;
        Student s = (Student)o;
        return id == s.id;
    }

    public int hashCode(){
        return Objects.hash(name, age, id);
    }
}
