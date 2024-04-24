package task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindTheLargestSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number Of Digits:");
		int n = s.nextInt();

		int arr[]= new int[n];	//{2,7,5,-1,-3,2,9,7};		//{3,-1,6,1,-5,1,3,-8};
		System.out.println("Enter Array: ");
		
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		ArrayList<Integer>al= new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			if (arr[i] > 0) {
				sum = arr[i];
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] < 0) {
						break;
					} else {
						sum += arr[j];
					}
				}
			}
			if(sum!=0) {
				al.add(sum);
			}
		}
		
		int max=0;
		for(int i=0;i<al.size();i++) {
			max=Math.max(al.get(i), max);
		}
		
		int start=0,end=0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			if (arr[i] > 0) {
				sum = arr[i];
				int k=0;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] < 0) {
						break;
					} else {
						sum += arr[j];
						k=j;
					}
				}
				if(sum==max) {
					start=i;
					end=k;
				}
			}
		}
		
		System.out.print("Input: "+Arrays.toString(arr)+"\nOutput:\nSum: "+max+"\nElements: ");
		
		for(int i=start;i<=end;i++) {
			if(i==end) {
				System.out.print(arr[i]);
			}
			else
			System.out.print(arr[i]+",");
		}
	}

}
