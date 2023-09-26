package problem4;

//import java.util.Vector;

public class Course {
    private String nameOfCourse;
    private String description;
    private int credits;
    private String prerequisite;

    public Course(){

    }

    public Course(String nameOfCourse, String description, int credits){
        this.nameOfCourse = nameOfCourse;
        this.description = description;
        this.credits = credits;
        this.prerequisite = "No prerequisite";
    }

    public Course(String nameOfCourse, String description, int credits, String prerequisite){
        this(nameOfCourse, description, credits);
        this.prerequisite = prerequisite;
    }   

    public String getName(){
        return nameOfCourse;
    }

    public String getDescription(){
        return description;
    }

    public String getPrerequisite(){
        return prerequisite;
    }

    public int getCredits(){
        return credits;
    }

    public String toString(){
        return "Name of course: " + nameOfCourse + ", Description: " + description + ", Credits: " + credits + ", Prerequisite: " + prerequisite;
    }
   /*  public static void main(String[] args){
        Vector<Course> courses = new Vector<Course>();
        courses.add(new Course("OOP", "Object Oriented Programming", 5, "PP2"));
        courses.add(new Course("ADS", "Algo", 5, "PP2"));
        System.out.println(courses);
    } */
}
