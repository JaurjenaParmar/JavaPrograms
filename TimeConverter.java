import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class TimeConverter{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the time in Milliseconds(ms): ");
	long ms=s.nextLong();
	//double seconds=ms/1000;
	//double minutes=seconds/60;
	double seconds=TimeUnit.MILLISECONDS.toSeconds(ms);
	double minutes=TimeUnit.MILLISECONDS.toMinutes(ms);
	System.out.println("Time in minutes(min) : "+minutes);
	System.out.println("Time in seconds(sec) : "+seconds);
	}
}