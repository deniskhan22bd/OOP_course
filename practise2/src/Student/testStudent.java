package Student;

import java.util.Vector;

public class testStudent {
    public static void main(String[] args){
        Student s = new Student("A", 100);
        System.out.println(s.getGrade() + " " + s.getName());
        Student s2 = new Student("B",99);   
        System.out.println(s2.getGrade() + " " + s2.getName());
        Vector<Student> student = new Vector<Student>();
        student.add(s);
        student.add(s2);
        student.add(new Student("C", 98));
        System.out.println(student);
    }
}
