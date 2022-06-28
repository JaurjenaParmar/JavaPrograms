public class MethodOverriding {
    public static void main (String []args) {
        Polygon p1 = new Polygon(10 , 10, 7.2);
        Rectangle r1 = new Rectangle(9 , 5, 8);
        Circle c1=new Circle(10, 2, 7.5);
        Square s1=new Square(6, 10, 8);
        System.out.println("Area is :"+p1.displayArea()); // this will execute parent class method "displayArea"
        System.out.println("Area is :"+r1.displayArea()); // rectangle class method "displayArea executes"
        System.out.println("Area is :"+c1.displayArea()); // overrides the parent class method "displayArea"
        System.out.println("Area is :"+s1.displayArea()); // executes square class method "displayArea" and overrides parent class method
    }
}
class Polygon {
    double length;
    double breadth;
    double radius;
    Polygon(double l , double b,double r) {
        length = l;
        breadth = b;
        radius=r;
    }
    Double displayArea() {
        System.out.println("Parent class: Default Area");
        return(length*breadth);
    }
}
class Rectangle extends Polygon {
    Rectangle(double l, double b, double r) {
        super(l ,b, r); // invokes parent class constructor
    }
    Double displayArea() {
        System.out.println("Area for rectangle.");
        return(length*breadth);
    }
}
class Square extends Polygon {
    Square(double l, double b, double r) {
        super(l ,b, r); // invokes parent class constructor
    }
    Double displayArea() {
        System.out.println("Area for Square.");
        return(length*length);
    }
}
class Circle extends Polygon {
    Circle(double l, double b, double r) {
        super(l ,b, r); // invokes parent class constructor
    }
    Double displayArea() {
        System.out.println("Area for Circle.");
        return(3.14*radius*radius);
    }
}

