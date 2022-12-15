package javaPurab;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int f,i,n;
		try
		{
			System.out.println("Enter any number : ");
			n=in.nextInt();
			for(i=1,f=1;i<=n;i++)
				f=f*i;
			System.out.println("The result is : "+f);
		}catch(Exception e) {}

	}

}
