package practise_for_ca.UMS;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Person{
    int rollno;
    String dept;
    ArrayList<Course> courses = new ArrayList<>();
    HashMap<Course, Integer> grades = new HashMap<Course, Integer>();

    public Student(String name, int age, int rollno, String dept) {
        super(name, age);
        this.rollno = rollno;
        this.dept = dept;
    }

    public  void enroll(Course  c){
        courses.add(c);
    }
    public void addgrade(Course c , Integer marks){
        grades.put(c,marks);
    }

    public void displayCourses(){
        for(Course c : courses){
            c.displayCourseDetails();

        }
    }
    public void displayCourseGrades (){
        grades.forEach((key, value)-> System.out.println(key.name +"   "+ value));
    }

    @Override
    public void displayDetails()
        {
            System.out.println("NAME : " + super.getName());
            System.out.println("AGE : "+super.getAge());
            System.out.println("ROLL NO : "+ this.rollno);
            System.out.println("DEPT : "+ this.dept);
            displayCourses();
            displayCourseGrades();
        }

}
