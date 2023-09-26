package problem4;

import java.util.Scanner;

import Student.Student;

public class testGradeBook {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        GradeBook book = new GradeBook();
        book.setCourse(new Course("CS101", "Object-oriented Programming and Design!", 5, "PP2"));
        System.out.println(book.displayMessage() + "\n\nPlease, input grades for students(Quit for break):\n");;
        while(true){
            System.out.print("Student ");
            String name = scan.next();
            if(name.equals("Quit")) break;
            int grade = scan.nextInt();
            book.addStudent(new Student(name, grade)); 
        }
        System.out.println(book.displayGradeReport());
        scan.close();


        System.out.println(book);
    }


}
