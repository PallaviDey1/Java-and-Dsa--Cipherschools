package corejava;
class car{
	String name;
	String color;
	int year;
	int maxspeed;
	void accelerate() {
		System.out.println("Car is accelerating ");
	}
}

public class carstudy {
	public static void main(String[]args) {
		car polo = new car();
		System.out.println(polo.name);
		System.out.println(polo.color);
		System.out.println(polo.year);
		System.out.println(polo.maxspeed);
		
		polo.name = "Polo";
		polo.color = "Black";
		polo.year = 2016;
		polo.maxspeed = 120;
		System.out.println(polo.name);
		System.out.println(polo.color);
		System.out.println(polo.year);
		System.out.println(polo.maxspeed);
		
		
		
		
		}

}
