package corejava;

public class Loop {
	public static void main(String [] args) {
		System.out.println(1);
		System.out.println(2);
		int i;
		for( i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		//loop breaks when i = 101
		System.out.println(i);
		System.out.println("*****************");
		for(i=0;i<100;i++)
		{
			System.out.println(i+1);
		}
		System.out.println("i is : " +i);
		
		
		
		//while loop
		
		int n = 5;
		while(n>0)
		{
			System.out.println("Hello");
			n--;
		}
		System.out.println("After while loop n is :" +n);
		
		
		//do while loop
		
		n=5;
		do {
			System.out.println(n);
			n--;
		}while(n>0);
		System.out.println("after do while loop n is :" +n);
		
}
}
