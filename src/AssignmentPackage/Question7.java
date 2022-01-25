//Given a number N, print sum of all even numbers from 1 to N.
package AssignmentPackage;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("Sum = "+sum);
		sc.close();

	}

}
