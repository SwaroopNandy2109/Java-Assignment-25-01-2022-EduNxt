//WAP to find weather the no entered by user is even or odd.
package AssignmentPackage;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if (n % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		sc.close();
	}

}
