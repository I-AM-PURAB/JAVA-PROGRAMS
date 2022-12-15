package javaPurab;
interface I {
final static int x = 13;
public void disp_x();
}
class I_class {
int x1;
void get_x1() {
x1 = 15;
}
void disp_x1() {
System.out.println("The value of x1 is " + x1);
}
}
class inter extends I_class implements I {
public void disp_x() {
System.out.println("The value of x is " + x);
}
}
public class intrfceimpl {
public static void main(String[] args) {
inter i = new inter();
i.disp_x();
i.get_x1();
i.disp_x1();

	}

}
