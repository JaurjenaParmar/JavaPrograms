import java.util.Scanner;
public class ReverseNumber{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to be Reversed: ");
		long n=s.nextLong();
		long rev=0;
		while(n>0){
			long num=n%10;
			rev=rev*10+num;
			n/=10; 
		}
		System.out.println("Reverse of the number is: "+rev);
}}
