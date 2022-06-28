public class Overloading{
	public static void calculateArea(double a){
		double area=3.14*a*a;
		System.out.println("Area of Circle is: "+area);
	}
	public static void calculateArea(int a){
		int area=a*a;
		System.out.println("Area of Square is: "+area);
	}
	public static void calculateArea(double a, double b){
		double area=a*b;
		System.out.println("Area of Rectangle is: "+area);
	}
	public static void main(String[] args){
		double l=13.6,b=5;
		int side=10;
		double r=12.7;
		calculateArea(r);
		calculateArea(l,b);
		calculateArea(side);	
	}
}