package geekforgeeks;
import java.util.Scanner;
public class Sum_of_array {

	public static void main(String[] args) {
	
		{
			 Scanner sc = new Scanner(System.in);
			 int T= Integer.parseInt(sc.nextLine());
			 int temp;
			 for(int i=0;i<T;i++)
			 {
			     temp=0;
			     int N= sc.nextInt();
			     sc.nextLine();
			     int Arr[]= new int[N];
			     for (int j=0;j<N;j++)
			        {
			         Arr[j]= sc.nextInt();
			        }
			     int k = N-1;
			     int n = 0;
			     while(k>n)
			        {
			         temp= Arr[k];
			         Arr[k]=Arr[n];
			         Arr[n]= temp;
			         k--;
			         n++;
			        }
			        
			      for (int l=0;l<N;l++)
			        {
			         System.out.print(Arr[l] + " ");
			        }
			      
			      System.out.println();
			 }
			 

		}
	}
	}

		