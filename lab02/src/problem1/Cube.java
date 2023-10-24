package problem1;

public class Cube extends Shape{
    private double lenght;

    public Cube(){
        super();
    }

    public Cube(double lenght){
        this.lenght = lenght;
    }

    public double volume(){
        return lenght * lenght * lenght;
    }

    public double surfaceArea(){
        return lenght * lenght * 6;
    }

    public double getLen(){
        return lenght;
    }

    public void setLen(double lenght){
        this.lenght = lenght;
    }


    public String toString(){
        return "Volume of Cube = " + volume() + ", surface area = " + surfaceArea();
    }
}
