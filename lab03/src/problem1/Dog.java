package problem1;

import java.util.Objects;

public class Dog extends Animal{
    private String breed;

    public Dog(){
        super();
    }

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
   
    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    @Override
    public void move() {
        System.out.println("dog move");
    }

	public String getBreed() {
		return breed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(breed);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(breed, other.breed);
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + "]";
	}
    
}
