class Polygon{
    double length;
    double breadth;
    double radius;
    double area;
}
class Circle extends Polygon{
    public double findArea(){
        area=3.14*radius*radius;
        return area;
    }
}
class Rectangle extends Polygon{
    public double findArea(){
        area=length*breadth;
        return area;
    }
}
class Square extends Polygon{
    public double findArea(){
        area=length*length;
        return area;
    }
}
public class Inheritance{
    public static void main(String args[]){
        Rectangle rec=new Rectangle();
        rec.length=12.9;
        rec.breadth=34.6;
        System.out.println("Area of Rectangle: "+rec.findArea());
        Circle c1=new Circle();
        c1.radius=7.8;
        System.out.println("Area of Circle: "+c1.findArea());
        Square s1=new Square();
        s1.length=12.9;
        System.out.println("Area of Rectangle: "+s1.findArea());

    }
}