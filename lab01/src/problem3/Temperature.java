package problem3;

public class Temperature {
    private double temperatureValue;
    private char scale;

    public Temperature(){
        temperatureValue = 0;
        scale = 'C';
    }

    public Temperature(double temperatureValue){
        this();
        this.temperatureValue = temperatureValue;
    }

    public Temperature(char scale){
        this();
        this.scale = scale;
    }

    public Temperature(double temperatureValue, char scale){
        this.temperatureValue = temperatureValue;
        this.scale = scale;
    }

    public char getScale(){
        return scale;
    }

    public String getInCelsius(){
        if(scale == 'C') return temperatureValue + " " + scale;
        else return (5 * (temperatureValue - 32)) / 9 + " C";
    }

    public String getInFahrenheit(){
        if(scale == 'F') return temperatureValue + " " + scale;
        else return (9 * (temperatureValue / 5) + 32) + " F";    
    }

    public void setTemperature(double temperatureValue){
        this.temperatureValue = temperatureValue;
    }

    public void setScale(char scale){
        this.scale = scale;
    }

    public void setFields(double temperatureValue, char scale){
        this.temperatureValue = temperatureValue;
        this.scale = scale;
    }

    public String toString(){
        return "Scale = " + scale + "\nIn Celsius = " + getInCelsius() + "\nIn Fahrengeit = " + getInFahrenheit(); 
    }


}
