package problem1;

import java.util.Objects;

public abstract class Transport implements Moveable{
    protected String name;
    protected int passengerCapacity;
    
    public Transport(){

    }

    public Transport(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
    }
    
    public void move(){
        System.out.println("You moved");
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public String toString(){
        return "Name: " + name + ", capacity: " + passengerCapacity;
    }

    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null) return false;
        if(o.getClass() != this.getClass()) return false;

        Transport t = (Transport)o;
        return t.passengerCapacity == passengerCapacity && t.name.equals(name);
    }

    public int hashCode(){
        return Objects.hash(name, passengerCapacity);
    }

}
