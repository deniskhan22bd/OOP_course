package problem4;
import java.util.Vector;

import Student.Student;

public class GradeBook {
	private Vector<Student> student = new Vector<Student>();
    private Course course = new Course();



    public GradeBook(){
    }

    public GradeBook(Student student, Course course){
        this.student.add(student);
        this.course = course;
    }

    public String displayMessage(){
        return "Welcome to the grade book " + course.getName() +  " " + course.getDescription();
    }

    public String displayGradeReport(){
        return "\nClass average is " + getAverageGrade() + ". Lowest grade is " + getLowestGrade().getGrade() + 
        " (Student " + getLowestGrade().getName() + ", id: " + getLowestGrade().getId() + ").\n" +
        "Highest grade is " + getHighestGrade().getGrade() + " (Student " + getHighestGrade().getName() + ", id:" + getHighestGrade().getId() + ").\n\n" + 
        "Grades distrinbution:\n" + outputBarChart();
    }

    public String outputBarChart(){
        String str = "";
        for(int i = 0; i <= 10; i++){
            if(i == 0){
                str +="00 - 09: ";
            }
            else if(i == 10) str += "100: ";
            else str += "" + i * 10 + " - " + (i * 10 + 9) + ":";
            for(Student s : student){
                if(s.getGrade() >= i * 10 && s.getGrade() <= i * 10 + 9){
                    str += " *";
                }
            }
            str += "\n";
            
        }
        return str;
    }


    public Vector<Student> getStudents(){
        return student;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    public void addStudent(Student student){
        this.student.add(student);
    }

    public double getAverageGrade(){
        double sum = 0;
        for(Student s : student){
            sum += s.getGrade();
        }

        return sum / (student.size());
    }

    public Student getHighestGrade(){
        Student st = new Student();
        st.setGrade(0);
        for(Student s : student){
            if(st.getGrade() < s.getGrade()){
                st = s;;
            };
        }
        return st;
    }

    public Student getLowestGrade(){
        Student st = new Student();
        st.setGrade(100);
        for(Student s : student){
            if(st.getGrade() > s.getGrade()){
                st = s;
            };
        }
        return st;
    }

    public String toString(){
        return "Students: " + student + " " + course;
    }

}
