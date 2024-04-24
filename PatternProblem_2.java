package task_2;

import java.util.Scanner;

public class PatternProblem_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = 5;
		
		int arr[][] = new int[n][n];
		int k = n/2;
		
		for (int i = 0; i < n; i++) {
			
				for (int j = 0; j < n; j++) {
					if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
						arr[i][j] = 1;
					}

				}
				if(k==i) {
				for(int j=0;j<arr.length;j++) {
					if(j%2==0) {
						arr[i][j]=1;
					}
					else {
						arr[i][j]=0;
					}
				}
				}
			
		}
		
		
		System.out.println("Output: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
