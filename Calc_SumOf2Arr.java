package task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Calc_SumOf2Arr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number Of Digits:");
		int n = s.nextInt();

		int arr1[] = new int[n]; // {9,2,8,1,3,5,6,7,3,1,1,6};

		System.out.println("Enter Array1: ");
		for (int i = 0; i < n; i++) {
			arr1[i] = s.nextInt();
		}
		System.out.println("Enter Number of Digits:");
		int t = s.nextInt();

		int arr2[] = new int[t]; // {7,8,4,6,2,1,9,9,7};

		System.out.println("Enter Array2: ");
		for (int i = 0; i < t; i++) {
			arr2[i] = s.nextInt();
		}

		long n1 = 0;
		long n2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			n1 = (n1 * 10) + arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			n2 = (n2 * 10) + arr2[i];
		}

		long sum = n1 + n2;

		String s1 = Long.toString(sum);

		int res[] = new int[s1.length()];

		for (int i = 0; i < res.length; i++) {
			res[i] = (s1.charAt(i) - 48);
		}
		System.out.println("Output:\n" + Arrays.toString(res));

	}

}
