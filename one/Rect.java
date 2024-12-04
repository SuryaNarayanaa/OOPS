package one;

class Rectangle{
    int length,breadth;
    Rectangle(int l, int b){
        this.length =l;
        this.breadth =  b;
    }
    void display(int data){
        System.out.println(data);
    }
    void calculateArea(int l,int b){
        int area = l * b;
        System.out.print("Area: ");
        display(area);
    }
    void calculatePerimeter(int l,int b){
        int peri = 2*l * b;

        System.out.print("Perimeter: ");
        display(peri);
    }
}
public class Rect {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10);
        System.out.println(r1);
    }
}
