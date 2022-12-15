package javaPurab;

import java.util.Scanner;

public class Exception_Handling 
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
try
{
int a[] = new int[5];
String s = null;
System.out.println(s.length());
} catch (ArithmeticException e) {
System.out.println("Arithmetic Exception occurs");
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBounds Exception occurs");
} catch (NullPointerException e) {
System.out.println("Null Pointer Exception");
}
System.out.println("rest of the code");
}
}
