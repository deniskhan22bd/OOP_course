package task01;

public class testStudent {
    public static void main(String[] args){
        Student s = new Student("Denis", 1);
        Student s2 = new Student("Nastya", 2);
        System.out.println("id: " + s.getId() + "\nname: " + s.getName() + "\nyear: " + s.yearOfStudy + "\n");
        System.out.println("id: " + s2.getId() + "\nname: " + s2.getName() + "\nyear: " + s2.yearOfStudy + "\n"); 
        
        s.incrementYearOfStudy();
        s2.incrementYearOfStudy();
        System.out.println("id: " + s.getId() + "\nname: " + s.getName() + "\nyear: " + s.yearOfStudy + "\n");
        System.out.println("id: " + s2.getId() + "\nname: " + s2.getName() + "\nyear: " + s2.yearOfStudy + "\n"); 
    }
}
