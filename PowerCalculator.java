import java.util.Scanner;
public class PowerCalculator{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the base number: ");
	int n=s.nextInt();
	System.out.print("Enter the power: ");
	int a=s.nextInt();
	int result=n;
	for(int i=1;i<a;i++){
		result*=n;
		}
	System.out.println("Result is : "+result);
	}
}