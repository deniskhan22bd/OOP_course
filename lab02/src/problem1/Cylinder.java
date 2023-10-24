package problem1;

public class Cylinder extends Shape{
    private double radius;
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String toString(){
        return "Volume of Cylinder = " + volume() + ", surface area = " + surfaceArea();
    }
}
