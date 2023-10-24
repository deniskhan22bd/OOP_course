package problem5;

public class Parallel extends Circuit{
    private Circuit a;
    private Circuit b;

    public Parallel(){
        super();
    }

    public Parallel(Circuit a, Circuit b){
        this.a = a;
        this.b = b;
    }

    public double getResistance(){
        return (a.getResistance() * b.getResistance()) / (a.getResistance() + b.getResistance());
    }

    public double getPotentialDiff(){
        return a.getPotentialDiff();
    }

    public void applyPotentialDiff(double V){
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
