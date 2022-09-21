package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is n?");
		int n = in.nextInt();
		
		//array
		int[] sieved = new int[n];
		for (int i = 0; i<n; i++) {
			sieved[i] = i+1;
		}
		
		
		boolean[] bools = new boolean[n]; 
		for( int g=0; g<n; g++) {
			bools[g] = false;
		}
		boolean prime = true;
		for(int a=0; a<n; a++) {
			prime = true;
			for(int b=2; b<a; b++) {
					if (sieved[a]%b == 0) {
						prime = false;
					}
	
				}
			if (prime){
				bools[a] = true;
			}
		}
		
		for(int c=0; c<n; c++) {
			if (bools[c] == true) {
				System.out.print(sieved[c]+ " ");
			}
		
		}
	}
}