import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			System.out.print(a[n - 1 - i]);
			
			if(i < n - 1)
				System.out.print(" ");
			else
				System.out.println("");
		}
	}
}