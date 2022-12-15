package javaPurab;

import java.util.Scanner;

public class twoDarray {

	public static void main(String[] args) {
		int a[][],r,c,i,j;
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.println("Enter row and column for 2D array: ");
			r=in.nextInt();
			c=in.nextInt();
			System.out.println("Enter 2D elements: ");
			a=new int[r][c];
			for(i=0;i<r;i++)
				for(j=0;j<c;j++)
					a[i][j]=in.nextInt();
			System.out.println("2D elements are: ");
			for(i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
					System.out.println(a[i][j]+" ");
				System.out.println();
			}
			System.out.println("The row length of 2D array is: "+a.length);
			System.out.println("The length of 2D array is: "+a[0].length);
		}catch(Exception e) {}

	}

}
