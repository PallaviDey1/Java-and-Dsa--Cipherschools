package dp;

public class Fibonaccii {
	static int fib(int n)
	{
		if(n<2)return n;
		
		return fib(n-1) +fib(n-2);
	}
	static int fibM(int n,int storage[])
	{
		if(n<2)return n;
		storage[n]=fibM(n-1,storage)+fibM(n-2,storage);
		return storage[n];
	}

	public static void main(String[] args) {
		int n=7;
		long start=System.currentTimeMillis();
		System.out.println(fib(n));
		
		start=System.currentTimeMillis();
		long end=System.currentTimeMillis();
		int storage[]=new int[n+1];
		System.out.println(fibM(n,storage));
		end=System.currentTimeMillis();
		System.out.println("Time by recursive approach: "+(end-start));
		
		

}
}
