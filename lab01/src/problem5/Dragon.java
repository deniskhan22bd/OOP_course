package problem5;

import java.util.Vector;

public class Dragon {
    private Vector<Person> persons = new Vector<Person>();

    public Dragon(){
    }

    public void kidnap(Person p){
        persons.add(p);
        checkPersons();
    }

    public boolean willDragonEatOrNot(){
        return persons.size() == 0;
    }

    private void checkPersons(){
        if(persons.size() <= 1){
            return;
        }
        for(int i = 0; i < persons.size() - 1; i++){
            if(persons.elementAt(i).getGender() == Gender.Boy & persons.elementAt(i + 1).getGender() == Gender.Girl){
                persons.removeElementAt(i + 1);
                persons.removeElementAt(i);
            }
        }

    }

    public Vector<Person> getPerson(){
        return persons;
    }
}
