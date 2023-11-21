package problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee(){

    }

    public Employee(String name, double salary, String insuranceNumber){
        super(name);
        this.salary = salary;
        this.hireDate = new Date();
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public Date getHireDate(){
        return hireDate;
    }

    public String getInsuranceNumber(){
        return insuranceNumber;
    }
    
    public int compareTo(Employee e){
        if(salary > e.salary) return 1;
        if(salary < e.salary) return -1;
        return 0;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
	public int hashCode() {
        return Objects.hash(name, hireDate, insuranceNumber, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(hireDate, other.hireDate) && Objects.equals(insuranceNumber, other.insuranceNumber)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	public String toString(){
        return super.toString() + " " + salary + " " + insuranceNumber + " " + hireDate; 
    }
}
