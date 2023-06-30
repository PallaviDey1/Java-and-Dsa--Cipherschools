package Accessmodifier2;
import Accessmodifier1.A;


public class D {
	public static void main(String[]args) {
		A obj = new A();
		//System.out.println(obj.x);//default is not accessible outside the package
		//System.out.println(obj.y);//private is not accessible outside the class
		System.out.println(obj.z);// public is accessible everywhere
		//System.out.println(obj.w);//protected is not accessible outside package in non subclass
	}

}
