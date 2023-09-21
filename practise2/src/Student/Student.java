package Student;

public class Student {
    String name;
    int id;
    int yearOfStudy = 1;

    Student(String name, int id){
        this.name = name;
        this.id = id;
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


}
