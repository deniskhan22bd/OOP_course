package problem4;

import java.util.Vector;

public class Manager extends Employee{
    private double bonus;
    private Vector<Employee> team = new Vector<Employee>();

    public Manager(){

    }

    public Manager(String name, double salary, String insuranceNumber, double bonus){
        super(name, salary, insuranceNumber);
        this.bonus = bonus;
    }

    public Manager(String name, double salary, String insuranceNumber, double bonus, Vector<Employee> team){
        super(name, salary, insuranceNumber);
        this.bonus = bonus;
        this.team = team;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public Vector<Employee> getTeam(){
        return team;
    }

    public void setTeam(Vector<Employee> v){
        team = v;
    }

    public void addTeammate(Employee e){
        team.add(e);
    }

    public int compareTo(Manager m){
        if(super.compareTo(m) == 0){
            if(bonus > m.bonus) return 1;
            if(bonus < m.bonus) return -1;
            return 0;
        }
        return super.compareTo(m);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
        
    }

    public boolean equals(Object o){
        if(!super.equals(o)) return false;

        Manager m = (Manager)o;
        return bonus == m.bonus && team.equals(m.team);
    }
    
    public String toString(){
        return super.toString() + " " + bonus + ", team: " + team ;
    }
}
