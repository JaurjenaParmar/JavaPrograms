import java.util.Scanner;
public class ArraySorting{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=s.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
} 