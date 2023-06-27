package keyword;
class A{
	final int noOfAlphabets=26; // final variable  once assigned the value cannot be changed
	final int noOfDigits;
	//either assign the value at time of declaration or assign the value inside the constructor
	A()
	{
		noOfDigits = 10;
	}
	final void fun()
	 
	{
		System.out.println("Hi, i'm a function in class A");
		
	}
}
final class B extends A{//final classes cannot be inherited
	//void fun()
	//{
	//	System.out.println("I'm a function in B overriding function in A");
	//}
	
}
//class C extends B{
	
//}

public class FinalStudy {
	public static void main(String[]args ) {
		
	}

}
