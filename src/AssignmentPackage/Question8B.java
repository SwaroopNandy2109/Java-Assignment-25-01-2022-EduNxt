/*
for n=4
4444
4444
4444
4444
*/
package AssignmentPackage;

import java.util.Scanner;

public class Question8B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(n);
			}
			System.out.println();
		}

		sc.close();
	}

}
