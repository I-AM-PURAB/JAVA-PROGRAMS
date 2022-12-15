package javaPurab;

import java.util.Scanner;

class prim {
	void check(int n) {
		int i;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Not prime");
				System.exit(0);
			}
		}
		System.out.println("Prime");
	}
}


public class Prime_or_not {

	public static void main(String[] args) {
		prim P = new prim();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number :");
		int n = in.nextInt();
		P.check(n);
	}

}
