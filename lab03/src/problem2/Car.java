package problem2;

import java.util.Objects;

public class Car implements Moveable{
    private String name;
    private int capacity;

    public Car(){

    }

    public Car(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

	@Override
	public void move() {
		System.out.println("I move(CAR)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacity, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return capacity == other.capacity && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", capacity=" + capacity + "]";
	}


}
