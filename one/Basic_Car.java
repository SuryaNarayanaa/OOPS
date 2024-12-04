package one;

class Car{
     
     String name,model,year;

         Car(String name, String model, String year){
            this.name  = name;
           this.model = model;
            this.year = year;
        }
        void displayDetails(){
            System.out.println("NAME  :"+this.name);
            System.out.println("MODEL : "+this.model);
            System.out.println("YEAR  :"+this.year);
        }
}


public class Basic_Car {
    public static void main(String[] args) {
        
            Car c1 = new Car("maruthi", "600","1984");
            c1.displayDetails();
    }
}
