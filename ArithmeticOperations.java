import java.util.Scanner;
public class ArithmeticOperations{
public static void main(String args[]){
System.out.println("Enter choice 1: Addition\nEnter choice 2: Subtraction\nEnter choice 3:Multiplication\nEnter choice 4:Division");
// arithmetic operations using switch case statements
Scanner s=new Scanner(System.in);
System.out.print("Enter two numbers :");
int a=s.nextInt();
int b=s.nextInt();
System.out.print("Enter your choice: ");
int choice=s.nextInt();
switch(choice){
case 1:
	System.out.println("Sum is : "+(a+b));
	break;
case 2:
	System.out.println("Difference is : "+(a-b));
	break;
case 3:
	System.out.println("Product is : "+(a*b));
	break;
case 4:
	System.out.println("Divison is : "+(a/b));
	break;
default:
	System.out.println("You entered a wrong choice!");
	
}
}
}