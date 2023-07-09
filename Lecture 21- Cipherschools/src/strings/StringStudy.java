package strings;

public class StringStudy {
	public static void main(String[]args) {

		String name = "Cipherschools";//created using string literal.stored in method area
		String name2 = "Cipherschools";
		String name3 = new String ("Cipherschools");//creating string using constructors
		String name4 = new String("Cipherschools");
		
		System.out.println(name==name2);//==operator compares references for objects and values for primitive
		System.out.println(name3==name4);
		System.out.println(name==name3);
		
		
		
		//Every time we do an operation on a string , anew object is created
		
		System.out.println("**************************************");
		System.out.println("1. Concatenation");
		//1. concatenation
		String s1 = "Hello";
		s1=s1 + " peeps";
		System.out.println(s1);
		System.out.println(s1+ " , How r you doing");
		
		//Another way to concat is to use function
		String s2 = new String("Hello");
		String s3 = new String("People");
		String s4 = s2.concat(s3);
		System.out.println(s4);
		System.out.println(s2);//remain same
		
		System.out.println("**************************************");
		System.out.println("2. Checking if strings are equal in value");
		
		//2. Checking if strings are equal in value
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
		
		//equals function -> object class
		//this generally compares references(hashcodes) of objects 
		//but, for string class  it has been overridden to check for content equality
		
		System.out.println("**************************************");
		System.out.println("3. Creating new string object for character array");
		 //3. Creating new string object for character array
		 
		char arr[]={'C' , 'i', 'p','h', 'e', 'r' };
		String StrFromArr = new String(arr);//constructor overloaded 
		System.out.println(StrFromArr);
		
		
		
		
		
		
				 
	}
}



