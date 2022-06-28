public class ArrayOperations{
public static void main(String args[]){
	int[] arr={100,12,-12,45,60,78,29,-67};
	int even_count=0,odd_count=0,count=0;
	System.out.print("Numbers less than 0 are: ");
	for(int i=0;i<arr.length;i++){
		if(arr[i]<0){
		System.out.print(arr[i] + " ");
		count++;
		}

		if(arr[i]%2==0){
			even_count++;}
		else{
			odd_count++;}
		}

	System.out.println("\nTotal negative numbers in array: "+count);	
	System.out.println("\nTotal even numbers in array: "+even_count);
	System.out.println("\nTotal odd numbers in the array: "+odd_count);
}
}