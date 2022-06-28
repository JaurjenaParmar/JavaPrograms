import java.util.Scanner;
public class DiamondPattern{
	public static void main(String args[]){
		int n=5;
		// this is to print the upper half of the diamond
		for(int i=1;i<=n;i++){
			for(int j=i;j<n;j++){
				System.out.print(" ");}
			for(int j=1;j<=(2*i-1);j++){
				if(j%2!=0){
					System.out.print("*");}
				else
					System.out.print(" ");
				}
			System.out.println(); // strats a new line
		}
		// this prints the lower half of the pattern
		for(int i=n-1;i>=1;i--){
			for(int j=i;j<n;j++){
				System.out.print(" ");}
			for(int j=1;j<=(2*i-1);j++){
				if(j%2!=0){
					System.out.print("*");}
				else
					System.out.print(" ");
			}
			System.out.println(); // starts a new line 
		}
}
}
