package javaPurab;

public class String_Buffer {

	public static void main(String[] args) {
		
		char[] ch= {'j','a','v','a','t','p','o','i','n','t'};
		String s=new String(ch);
		System.out.println("The string is " + s);
		System.out.println("the individyal first charecdter is " +ch[0]);
		String s1=new String("moinak ");
		String s2=new String("purab");
		s1.concat(s2);
		System.out.println("the string is " + s1.concat(s2));
		StringBuffer s3=new StringBuffer("moinak ");
		StringBuffer s4=new StringBuffer("purab");
		s3.append(s4);
		System.out.println("the string is " + s3 );
		s3.insert(3,"java ");
		System.out.println("the string is " + s3 );
		s3.setLength(9);
		System.out.println("the string is " + s3 );
		if(s1.equals(s2))
		{
			System.out.println("the string are equal ..." );
		
		}
		else
		{
			System.out.println("the string are not equal ..." );
		}
			s4.setCharAt(3, 'x');
			System.out.println("the updated string is " +s4);
}

	}


