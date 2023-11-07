package practise6;

public class Restoraunt {
    private String name;


    public Restoraunt(){

    }

    public Restoraunt(String name){
        this.name = name;
    }

    public void servePizza(CanHavePizza chp){
        chp.eatPizza();
        if(chp instanceof Student){
            Student s = (Student)chp;
            s.payPizza(100);
        }
        else if(chp instanceof Person){
            Person p = (Person)chp;
            p.payPizza(100);
        }
    }

    public String toString(){
        return "Name: " + name;
    }
}
