package practise_for_ca.UMS;

import java.util.ArrayList;
import java.util.List;

public class Course {
    int courseId;
    String name;
    int credits;
    Professor prof;
    ArrayList<Student> students = new ArrayList<Student>() ;

    public Course(int courseId, String name, int credits, Professor prof) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.prof = prof;
    }

    public  void addStud(Student s){
        students.add(s);
        System.out.println("Student "+ s.getName()+"added successfully");
    }

    public  void removeStud(Student s){
        students.remove(s);
        System.out.println("Student "+ s.getName()+"removed successfully");
    }

    public void listAllStudents(){
        for(Student s : students){
            s.displayDetails();
        }
    }

    public  void displayCourseDetails(){
        System.out.println("COURSE : "+ this.name);
        System.out.println("COURSE ID : "+this.courseId);

        System.out.println("CREDITS :" + this.credits);
        System.out.println("PROFESSOR : "+this.prof.name);

    }
}
