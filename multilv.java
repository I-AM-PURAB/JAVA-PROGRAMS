package javaPurab;

class A 
{
	void disp_A() 
	{
		System.out.println("Display A");
	}
}
class B extends A 
	{
		void disp_B()
		{
		System.out.println("Display B");
		}
	}
class C extends B
	{
		void disp_c() {
		System.out.println("Display c");
		}
	}
public class multilv {
	public static void main(String[] args)
	{
		C c = new C();
		c.disp_A();
		c.disp_B();
		c.disp_c();
	}
	
}
