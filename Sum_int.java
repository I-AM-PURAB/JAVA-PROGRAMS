package javaPurab;

import java.util.Scanner;

public class Sum_int {

	public static void main(String[] args) {
		int i ;
		int s = 0;
		int n = Integer.parseInt(args[0]);
		int[] a;
		a = new int[n];
		System.out.println("enter the numbers one by one: ");
		Scanner in = new Scanner(System.in);
		for(i = 0; i < n; i++)
		{
			a[i]=in.nextInt();
			s = s + a[i];
		}
		System.out.println("The sum of Integer is: "+s);
	}

}
