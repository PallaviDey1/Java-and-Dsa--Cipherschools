package corejava;
import java.util.*;
class Student{
	String name;
	int marks;
	boolean checkPass() 
	{
		if(marks>40) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}

public class controlflow {
	int findMax(int a, int b, int c)
	{
		if(a>b)//nested if else
		{
			if (a>c)
			{
				return a;
			}
			else {
				return c;
			}
			
		}
		else {
			if(b>c)
			{
				return b;
			}
			else {
				return c;
			}
		}
	}
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.name = "Ram";
		s1.marks = 80;
		Student s2 = new Student();
		s2.name = "sham";
		s2.marks = 30;
		System.out.println(s1.checkPass());
		System.out.println(s2.checkPass());
		controlflow cf = new controlflow();
		System.out.println(cf.findMax(10, 7, 15));
		char c = 'a';
		switch(c)
		{
		case 'a':
			System.out.println("Hi, I'm a");
			break;
		case 'b':
			System.out.println("Hi, I'm b");
			break;
		case 'c':
			System.out.println("Hi, I'm c");
			break;
			default:
				System.out.println("I'm not a ,b,c");
		}
			
			
		
		
		}
	
		
		
	}

