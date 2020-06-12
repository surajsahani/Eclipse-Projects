package geekforgeeksbasics;
import java.util.Scanner;
public class Kth_smallest_number {

		public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		while(t-->0) {
		        int n = sc.nextInt();
		        int arr[] = new int[n];
		        for (int i=0; i<n ;i ++) {
		        	arr[i] = sc.nextInt();
		        }
		     System.out.println(arr[3]);
                int ar[] = new int[n];
                for (int i=0; i<n ;i ++) {
        	    arr[i] = sc.nextInt();
        }
            System.out.println(arr[4]);
	  }
	}
}


