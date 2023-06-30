package Encapsulation;
class Demo{
	private int a = 5;
	private int b = 10;
	private int c = 15;
	private int d = 20;
	
	 public int getA()//getter
	 {
		 System.out.println("value of A read");
		 return this.a;
		 
	 }
	 public int getB() {
		 System.out.println("Value of B read");
		 return this.b;
	 }
	 public void setA(int a)
	 {
		 if(a>100)
		 {
			 this.a =a; 
			 System.out.println("Value of A change to : " +a);
		 }
		 else {
			 System.out.println("Cannot set - value outside limits");
			 
		 }
		 
		 
	 }
	 public void setB(int b)
	 {
		 this.b =b;
		 
	 }
	public int getC()//only getter of c  -> read only
	{
		return c;
	}
	
	public int getD() 
	//only getter of D  -> read only
	{
		return d;
	}
	
	 
}

public class EncapStudy {
	public static void main(String[]args) {
		Demo d = new Demo();
		//System.out.println(d.a);//not visible because its private
		System.out.println(d.getA());
		d.setA(100);
		System.out.println(d.getA());
	}

}
