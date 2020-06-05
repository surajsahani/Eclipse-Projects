package geekforgeeks;
import java.util.Arrays;
import java.util.Scanner;
public class Largest_element_in_an_array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0){
			
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{  arr[i]=sc.nextInt();
		
		}
		        
		        Arrays.sort(arr); 
				System.out.println(arr[n-2]);
		    }
		} 
	}
