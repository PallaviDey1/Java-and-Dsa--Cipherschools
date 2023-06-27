package keyword;
class Loan{
	int rate;
	Loan(){
		System.out.println("Hi, I'm default constructor of loan");
		}
	Loan(int rate){
		this.rate = rate;
		
	}
	void printRate()
	{
		System.out.println(this.rate);
		}
	}
class CarLoan extends Loan{
	int rate;
	CarLoan(){
		System.out.println("Hi , I'm default constructor of Carloan");
		System.out.println(super.rate);
	}
	CarLoan(int rate){
		super(7);//to invoke the constructor of parent class(must be the 1st line of the child class)
		this.rate = rate;
	}
	void printRate() {
		System.out.println(this.rate);
		super.printRate();//using super to invoke methodsof thr parent class
		System.out.println(super.rate);
	}
}

public class SuperStudy {
	public static void main(String[]args) {
		CarLoan cl = new CarLoan(8);
		CarLoan cl2 = new CarLoan();
		cl.printRate();	
		

}
}
