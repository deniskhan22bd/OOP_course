package problem5;

import java.util.Vector;

public class Dragon {
    private Vector<Person> persons = new Vector<Person>();

    public Dragon(){
    }

    public void kidnap(Person p){
        persons.add(p);
    }

    public boolean willDragonEatOrNot(){
        int people = 0, pair = 0;
        for(Person p : persons){
            if(p.getGender() == Gender.Boy) people++;
            else{
                if(people == 0) return false;
                else{
                    people--;
                    pair++;
                }
            }
        }

        return pair * 2 == persons.size();
    }

    public Vector<Person> getPerson(){
        return persons;
    }
}
