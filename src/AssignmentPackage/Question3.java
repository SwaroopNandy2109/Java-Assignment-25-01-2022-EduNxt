//WAP to find the greatest between the 3 nos and display the output.
package AssignmentPackage;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = Math.max(c, Math.max(a, b));
		System.out.println("The maximum number is: " + max);
		sc.close();
	}

}
