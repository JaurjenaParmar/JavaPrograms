import java.util.Scanner;
public class PasswordValidator{
	public static boolean isValid(String str){
		boolean a=true,b=false,c=false;
		int total_digits=0;
		for(int i=0;i<str.length();i++){
			if ((Character.isLetterOrDigit(str.charAt(i)) == false)) {  // checks if the password conatins digits or letters only
           			a=false;
			}
			if(Character.isDigit(str.charAt(i))){                  // counts how may digits are there in a password entered
				total_digits++;
			}
		}
		if(total_digits>=2){
			b=true;
		}
		if(str.length()==6){       // checks if the password is of length 6 or not
			c=true;
		}
		boolean result=false;
                if(a==true && b==true && c==true){
			result=true;
		}
		return result;	
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		boolean validity=isValid(str);            
		System.out.println("Password is Valid : " + validity);
	}
}
