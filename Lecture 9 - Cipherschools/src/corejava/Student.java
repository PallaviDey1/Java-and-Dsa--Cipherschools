package corejava;

public class Student {
	int rollNo; //camel casing
	String name;
	public static void main(String[] args) {
		Student s1 = new Student();
		
		Student s2 = new Student();
		
		Student s3 = new Student();
		
		s1.name = "Ram";
		s1.rollNo = 1;
		
		s2.name = "Sham";
		s2.rollNo = 2;
		
		s3.name = "Shyam";
		s3.rollNo = 3;
		
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		
		System.out.println(s2.name);
		System.out.println(s2.rollNo);
		
		System.out.println(s3.name);
		System.out.println(s3.rollNo);
}
}
