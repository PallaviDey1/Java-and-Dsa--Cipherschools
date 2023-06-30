package Accessmodifier2;
import Accessmodifier1.A;

public class C extends A {
	public static void main(String[]args) {
		A obj = new A();
		C childobj = new C();
		//System.out.println(obj.x);//default is not accessible outside the package
		//System.out.println(obj.y);//private is not accessible outside the class
		System.out.println(obj.z);
		System.out.println(childobj.w);//protected will be visible in different package in subclass , using object of subclass
		
	}

}
