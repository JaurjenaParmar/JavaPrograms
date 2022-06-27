import java.util.*;
import java.text.*;
public class Main
{
	public static void main(String[] args) {
		//Creating a Calendar class instance based on current time
		Calendar calendar = Calendar.getInstance();
		Date date=new Date();
		//converting date and time in appropriate formats
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Date with Format(yyyy-MM-dd) : "+formatter.format(date));
		
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date with Format(dd/MM/yyyy) : "+formatter.format(date));
		
		formatter = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println("Date with Format(dd-MMM-yyyy) : "+formatter.format(date));

        formatter =new SimpleDateFormat("E, MMM dd yyyy");
        System.out.println("Date with Format(E, MMM dd yyyy) : "+formatter.format(date));
        
        System.out.println("\nCurrent date and Time is : "+calendar.getTime());
        //Adding 1 month, 2 days and 4 years to current date and Time
        calendar.add(Calendar.MONTH,1);
        calendar.add(Calendar.DATE,2);
        calendar.add(Calendar.YEAR, 4);
        System.out.println("\n****After 1 month, 2 days and 4 years****");
        System.out.println("Date and Time : "+calendar.getTime());
        
        System.out.println("\n****Before 1 month, 2 days and 4 years****");
        calendar.add(Calendar.MONTH,-1);
        calendar.add(Calendar.DATE,-2);
        calendar.add(Calendar.YEAR,-4);
        System.out.println("Date and Time : "+calendar.getTime());
	}
}
