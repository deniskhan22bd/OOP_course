package problem1;

public class Sphere extends Shape{
    private double radius;

    public Sphere(){

    }

    public Sphere(double radius){
        this.radius = radius;
    }

    public double volume(){
        return (4 * Math.PI * radius * radius * radius) / 3;
    }

    public double surfaceArea(){
        return 4 * Math.PI * radius * radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String toString(){
        return "Volume of Sphere = " + volume() + ", surface area = " + surfaceArea();
    }
}
