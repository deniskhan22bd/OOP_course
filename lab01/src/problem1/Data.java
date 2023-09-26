package problem1;

public class Data {
    private double value;
    private double largestValue;
    private int counter;
    
    public Data(){
        
    }

    public void addValue(double value){
        if(largestValue < value) largestValue = value;
        this.value += value;
        counter++;
    }

    public double average(){
        return value/counter;
    }

    public double getLargestValue(){
        return largestValue;
    }

    public String toString(){
        return "Average value = " + largestValue + "\nLargest = " + average();
    }
}
