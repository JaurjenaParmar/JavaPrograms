public class Interfaces {  
    public static void main(String arg[])    {    
        Rectangle r = new Rectangle();    
        Circle c = new Circle();
        Square s=new Square();    
        area a1;    
        a1 = r;    
        System.out.println("Area of Rectangle is : " +a1.calculateArea(10,20));    
        a1 = c;    
        System.out.println("Area of Circle is : " +a1.calculateArea(15,14));   
        a1 = s;    
        System.out.println("Area of Square is : " +a1.calculateArea(15,19));  
    }  
} 
interface area    {    
        double pi = 3.14;    
        double calculateArea(double x,double y);    
}   
class Rectangle implements area{    
    public double calculateArea(double x,double y){    
        return(x*y);    
    }    
}       
class Circle implements area{    
    public double calculateArea(double x,double y){    
        return(pi*x*x);    
    }    
} 
class Square implements area{    
    public double calculateArea(double x,double y){    
        return(x*x);    
    }    
}
  
       
       
  
