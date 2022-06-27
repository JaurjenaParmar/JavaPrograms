
public class Pattern
{
	public static void main(String[] args) {
		int n=5;
		// Inverted right angled Triangle Pattern
		for(int i=5;i>=1;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		
		
		// Triangle Pattern
		for(int i=1;i<=5;i++){
		    for(int j=i;j<n;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=(2*i-1);j++){
		        if(j==1||i==n||j==(2*i-1)){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}

