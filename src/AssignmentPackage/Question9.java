//Reverse an Array.
package AssignmentPackage;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("The elements of the array in reverse order is:");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
		sc.close();

	}

}
