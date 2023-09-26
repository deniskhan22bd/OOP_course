package Student;

public class Student {
    private static int numOfStudent;
    private String name;
    private int id;
    private int yearOfStudy = 1;
    private int grade;
    public Student(){
        numOfStudent++;
        id = numOfStudent;
    }

    public Student(String name, int grade){
        this();
        this.name = name;
        this.grade = grade;
    }  

    public int getGrade(){
        return grade;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void incrementYearOfStudy(){
        yearOfStudy++;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public String toString(){
        return "Name:" + name + ", id: "+ id + ", year: " + yearOfStudy + ", grade: " + grade;
    }

}
