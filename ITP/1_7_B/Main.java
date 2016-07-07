import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i, j, k, cnt = 0;
		int n, x;
		int[] ans = new int[100];
		
		for(i = 0; i < 100; i++){
			ans[i] = 0;
		}
		
		try{
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("1_7_B.txt")));
			while(true){
				n = sc.nextInt();
				x = sc.nextInt();
				
				if(n == 0 && x == 0){
					break;
				}
				
				pw.println(n + " " + x);
				
				for(i = 1; i <= n - 2; i++){
					for(j = i + 1; j <= n - 1; j++){
						for(k = j + 1; k <= n; k++){
							pw.print(i + " + " + j + " + " + k + " = " + (i+j+k));
							if(i + j + k == x){
								pw.println(" O");
								ans[cnt] ++;
							}
							else{
								pw.println(" X");
							}
						}
					}
				}
				
				cnt ++;
			}
			
			pw.close();
		} catch(IOException e){
			System.out.println(e);
		}
		
		for(i = 0; i < cnt; i++){
			System.out.println(ans[i]);
		}
	}
}