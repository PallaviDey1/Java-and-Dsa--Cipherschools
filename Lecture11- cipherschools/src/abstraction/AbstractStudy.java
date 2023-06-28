package abstraction;
abstract class Car //we cannot instantiate an abstract class. we cannot create object of an abstract class
{
	int  maxspeed;
	abstract void accelerate();//only declared but not implemented
	//they are created to force the child classes to implement them before  using
	abstract void brake();
}
abstract class BMW extends Car{
void accelerate() {
	System.out.println("BMW is accelerating");
}
}
class BMW2 extends BMW{
	void brake() {
	System.out.println("BMW is applying brakes");	
	}
}
abstract class A{
	int x = 10;
	void fun()
	{
		System.out.println("Hello, I am A");
	}
}

public class AbstractStudy {

	public static void main(String[]args) {
		//car c = new Car();//cannot instantiate an abstract class
		//BMW beemer = new BMW();
		//beemer.accelerate();
		BMW2 b = new BMW2();
		b.accelerate();
		b.brake();
		}
}
