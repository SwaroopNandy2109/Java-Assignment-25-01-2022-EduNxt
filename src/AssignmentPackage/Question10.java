//Swap the nos in Array.
package AssignmentPackage;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			temp = ar[i];
			ar[i] = ar[i + 1];
			ar[i + 1] = temp;
		}
		System.out.println("The array after swapping elements is:");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		sc.close();

	}

}
