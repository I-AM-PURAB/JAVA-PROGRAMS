package javaPurab;

import java.util.Scanner;

public class oneDarray {

	public static void main(String[] args) {
		int a[],i,n;
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.println("Enter how many numbers : ");
			n=in.nextInt();
			System.out.println("Enter array elements : ");
			a=new int[n];
			for(i=0;i<n;i++)
				a[i]=in.nextInt();
			System.out.println("The Array elements are : ");
			for(i=0;i<n;i++)
				System.out.println(a[i]+" ");
			
		}catch(Exception e) {}

	}

}
