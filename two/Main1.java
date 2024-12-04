package two;

class Vehicle{
    void display()
    {
        System.out.println("in Vehicle");
    }
}


class Car extends Vehicle{
    void display()
    {
        System.out.println("in car");
    }
}

class EV extends Car{
    void display()
    {
        System.out.println("in ev");
    }
}
public class Main1 {
    public static void main(String[] args) {
        
        Vehicle v = new Vehicle();
        Car c = new Car();
        EV e =  new EV();

        v.display();c.display();e.display();

    }
    
}
