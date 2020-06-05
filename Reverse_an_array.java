package geekforgeeks;

import java.util.Scanner;

public class Reverse_an_array {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		    System.out.println("");
		
		int T = input.nextInt();
		for(int i=0; i<T; i++)
		{
			System.out.println("");
			
			int n=input.nextInt();
			int[] array=new int[n];
			
			for(int j=0; j<n; j++)
			 {
				array[j]=input.nextInt();
		      }
			System.out.println("");
			
			 for(int y=0 ; y<n;  y++)
			 {
			 System.out.println(array[y]);
			 }
			 int k=100;
			 int[] reverse=new int[n];
			 
			  for(int b=0; b<n; b++)
			  {
				  reverse[k-1]=array[b];
				  k=k-1; 
			  }
			  System.out.println("");
			  		
			  	     for(int z=0; z<n; z++)
			  				   {
			  				    System.out.println(reverse[z]+ "");
			  					}
			                   System.out.println();
		}
		
	  }
	
}

