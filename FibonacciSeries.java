import java.util.Scanner;
public class FibonacciSeries{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int t1=0,t2=1;
	System.out.println("Enter the total terms to be displayed in fibonacci series: ");
	int n=s.nextInt();
	System.out.println("Fibonacci Series: ");
	for(int i=0;i<n;i++){
		System.out.print(t1+" ");
		int t3=t2+t1;
		t1=t2;
		t2=t3;
	}
	}
}