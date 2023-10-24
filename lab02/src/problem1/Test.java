package problem1;

import java.util.Vector;

public class Test {
    public static void main(String args[]){
        Vector<Shape> vec = new Vector<Shape>();

        Cube cube = new Cube(10);
        System.out.println(cube);

        Cylinder cyl = new Cylinder(10, 10);
        System.out.println(cyl);

        Sphere sph = new Sphere(10);
        System.out.println(sph);

        vec.add(cube);
        vec.add(cyl);
        vec.add(sph);

        for(Shape s : vec){
            System.out.println(s);
        }
    }
}
