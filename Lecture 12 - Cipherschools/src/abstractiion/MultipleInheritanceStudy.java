package abstractiion;
interface A{
	int x = 10;
	void fun();
	
	
}
interface B{
	int x= 20;
	void fun();
}

class C implements A,B{
	public void fun(){
		System.out.println("Hello, I'm function in C");
		System.out.println(A.x);//ambiguity resolved using fully qualified name
		System.out.println(B.x);
		System.out.println(A.super.hashCode());
		System.out.println(B.super.hashCode());
		
	}
	
}
interface O extends A,B {
	//multiple inheritance in interfaces
	void fun();
	
 
}
class D implements O{
	public void fun() {
		
	
	System.out.println("Hello , I'm function in D");
}
}

public class MultipleInheritanceStudy {
	public static void main(String[]args) {
		C c = new C();
		c.fun();
		D d = new D();
		d.fun();
		}
	

}
