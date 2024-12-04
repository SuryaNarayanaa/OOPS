package practise_for_ca.UMS;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("surya", 19, 256, "CSE AIML");
        Student s2 = new Student("narayanaa", 20, 259, "CSE AIML");

        Professor p1= new Professor("Vigneswaran");
        Professor p2 = new Professor("sridevi");
        Course c1= new Course(1 ,"EVS", 5  ,p1 );

        Course c2= new Course(2,"probs", 5  ,p2 );

        s1.enroll(c1);
        s2.enroll(c2);

        s1.addgrade(c1, 100);
        s2.displayDetails();

    }
}
