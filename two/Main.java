package two;
 class Person{

    String name;
    int age;
    Person(String n , int a){
        this.name =n;
        this.age = a;
    }
    void display()
    {
        System.out.println("Student details");
        System.out.println(this.name +" \n"+this.age );
    }
}

class Student extends Person{
    String dept;
    int gpa;
    Student(String n , int a, String d , int g){
        super(n,a);
        this.dept =d;
        this.gpa = g;
    }
    void display()
    {
        super.display();
        System.out.println(this.dept +" \n"+this.gpa );

    }
}
class Main{
    public static void main(String[] args) {
        Person p = new Person("surya", 10);
        p.display();
        System.err.println();
        Student  s = new Student("not surya", 903, "cse", 9009);
        s.display();
    }   
}