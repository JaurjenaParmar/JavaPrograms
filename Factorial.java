import java.util.Scanner;
//This program calculates factorial of a number
public class Factorial{
	public static int calculateFactorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a numner: ");
	int n=s.nextInt();
	System.out.println("Factorial of a number is: "+calculateFactorial(n));
	}
}
