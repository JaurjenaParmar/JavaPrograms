import java.util.Scanner;
public class Operations{
public static void main(String args[]){
System.out.println("Enter choice 1: Addition\nEnter choice 2: Subtraction\nEnter choice 3:Multiplication\nEnter choice 4:Division");
// arithmetic operations using if else-if else statements
Scanner s=new Scanner(System.in);
System.out.print("Enter two numbers :");
int a=s.nextInt();
int b=s.nextInt();
System.out.print("Enter your choice: ");
int choice=s.nextInt();
if(choice==1)
	System.out.println("Sum is : "+(a+b));
	
else if(choice==2)
	System.out.println("Difference is : "+(a-b));
	
else if(choice==3)
	System.out.println("Product is : "+(a*b));
	
else if(choice==4)
	System.out.println("Divison is : "+(a/b));
	
else
	System.out.println("You entered a wrong choice!");
	
}
}