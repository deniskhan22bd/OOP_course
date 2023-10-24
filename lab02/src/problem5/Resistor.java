package problem5;

public class Resistor extends Circuit{
    private double resistance;
    private double potentialDifference;

    public Resistor(){
        super();
    }

    public Resistor(double resistance){
        this.resistance = resistance;
    }

    public double getResistance(){
        return resistance;
    }

    public double getPotentialDiff(){
        return potentialDifference;
    }

    public void applyPotentialDiff(double V){
        this.potentialDifference = V;
    }

}
