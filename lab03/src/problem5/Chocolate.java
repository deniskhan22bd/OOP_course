package problem5;

import java.util.Objects;

public class Chocolate implements Comparable<Chocolate>{
    private double weight;
    private String name;

    public Chocolate(){

    }

    public Chocolate(double weight, String name){
        this.name = name;
        this.weight = weight;
    }

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @Override
    public int compareTo(Chocolate o) {
        if(weight > o.weight) return 1;
        if(weight < o.weight) return -1;
        return 0;
    }

	@Override
	public int hashCode() {
		return Objects.hash(name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

    @Override
	public String toString() {
		return  weight + " " + name;
	}
}
