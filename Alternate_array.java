package geekforgeeks;

import java.util.Scanner;

public class Alternate_array {

		
		public static void main (String[] args)
		{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		t--;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
           {
		
					a[i]=sc.nextInt();
					}
		for(int j=0;j<n;j++)
				 {
						 
			 System.out.print(a[j]);
			 j++;
			
				 }
					 System.out.println("");
	
				}
			}
	    }

    
