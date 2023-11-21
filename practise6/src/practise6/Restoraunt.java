package practise6;

public class Restoraunt {
    private String name;


    public Restoraunt(){

    }

    public Restoraunt(String name){
        this.name = name;
    }

    public void servePizza(CanHavePizza eater){
        eater.eatPizza();
        if(eater instanceof Student){
            Student s = (Student)eater;
            s.payPizza(100);
        }
        else if(eater instanceof Person){
            Person p = (Person)eater;
            p.payPizza(100);
        }
    }

    public String toString(){
        return "Name: " + name;
    }
}
