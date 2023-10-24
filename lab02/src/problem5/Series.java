package problem5;

public class Series extends Circuit {
    private Circuit a;
    private Circuit b;

    public Series(){
        super();
    }
    
    public Series(Circuit a, Circuit b){
        this.a = a;
        this.b = b;
    }

    public double getPotentialDiff(){
        return a.getPotentialDiff() + b.getPotentialDiff();
    }

    public double getResistance(){
        return a.getResistance() + b.getResistance();
    }

    public void applyPotentialDiff(double V){
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }
}
