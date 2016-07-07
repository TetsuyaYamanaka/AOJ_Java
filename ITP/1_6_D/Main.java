import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[100][100];
		int[] b = new int[100];
		int c;
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < m; i++){
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++){
			c = 0;
			
			for(int j = 0; j < m; j++){
				c += a[i][j] * b[j];
			}
			
			System.out.println(c);
		}
	}
}