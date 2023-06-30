package Accessmodifier1;

public class B {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.x);//default is accessible in the same package
		//System.out.println(obj.y);//private is not accessible outside the class
		System.out.println(obj.z);	//public is used everywhere
		System.out.println(obj.w);
	}

}
