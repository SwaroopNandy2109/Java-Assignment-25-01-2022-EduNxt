/*
for n=4
1
22
333
4444
*/
package AssignmentPackage;

import java.util.Scanner;

public class Question8A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		sc.close();
	}

}
