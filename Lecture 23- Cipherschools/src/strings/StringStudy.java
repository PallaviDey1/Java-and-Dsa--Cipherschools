package strings;

import java.util.Scanner;

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
		
		//4. Creating  partial string object for character array
		
		System.out.println("**************************************");
		System.out.println("4. Creating partial string object for character array");
		
		String partialStrFromArr = new String(arr,1 ,3);//constructor overloaded 
		System.out.println(partialStrFromArr);
		
		String partialStrFromArr2 = new String(arr,2 ,3);//constructor overloaded 
		System.out.println(partialStrFromArr2);
		
		//5. Changing the case of the string
		
		System.out.println("**************************************");
	    System.out.println("5.  Changing the case of the string");
	    System.out.println(name.toLowerCase());
	    System.out.println(name.toUpperCase());
	  //  name= name.toUpperCase();
	    System.out.println(name);//remain same
	    
	  //6. Splitting
		
	  		System.out.println("**************************************");
	  	    System.out.println("6.  Splitting");
	  	    System.out.println("Please enter your full name :");
	  	    Scanner sc = new Scanner(System.in);
	  	    String fullName = sc.nextLine();
	  	    String strArr[]= fullName.split(" ");
	  	    for(int i=0;i<strArr.length;i++)
	  	    {
	  	    	System.out.println(strArr[i]);
	  	    }
	  	    
	  	  System.out.println("Please enter something seperated by commas: ");
	  	    
	  	    String csvText = sc.nextLine();
	  	    String csvArr[]= csvText.split(",");
	  	    for(int i=0;i<csvArr.length;i++)
	  	    {
	  	    	System.out.println(csvArr[i]);
	  	    }
	  	    
	  	  System.out.println("Please enter something separated by dots");
	  	    
	  	    String dotText = sc.nextLine();
	  	    String dotArr[]= dotText.split("[.]");//dot is a meta char in regex,so we need to use it in square beackets
	  	    for(int i=0;i<dotArr.length;i++)
	  	    {
	  	    	System.out.println(dotArr[i]);
	  	    }
	  	    
	  	  String backSlashText = "hello, i attend \"java\" class"; // we cant keep double quote inside double quote . so we are escaping using backslash
	  	    String backSlashArr[]= backSlashText.split("[.]");//dot is a meta char in regex,so we need to use it in square beackets
	  	    for(int i=0;i<backSlashArr.length;i++)
	  	    {
	  	    	System.out.println(backSlashArr[i]);
	  	    }
	  	    
	  	//7. Length of the string
			
	  		System.out.println("**************************************");
	  	    System.out.println("7. Length of the string");
	  	    int len = name.length();
	  	    System.out.println("Length of: "+ name+" is: " + len);
	  	    
       //8. Finding index of a char in a string
			
	  		System.out.println("**************************************");
	  	    System.out.println("8. Finding index of a char in a string");
	  	    int index = name.indexOf('e');//return first occurrence of that character
	  	    System.out.println("index of 'e' in "+ name+" is: " + index);
	  	    
	  	    int index2 = name.indexOf('E');//return -1 if not found
	  	    System.out.println("index of 'E' in "+ name+" is: " + index2);
	  	    
	  	    int index3 = name.indexOf("School");
	  	    System.out.println("index of School in " + name+ " is: " + index3);
	  	    
	  	    int index4 = name.indexOf('O',10);//start searching from index 10,10 included
	  	    System.out.println("index of 'o' in "+ name+" is: " + index4);
		    
	  	    
	  	    int indexOfO=0;
		    //while(indexOfO != -1)//stop at -1 or till not -1
	  	    while(true)//infinite loop
		    {
		        indexOfO = name.indexOf('o', indexOfO + 1);
		    	if(indexOfO == -1) break;
		    	System.out.println("O found at : " + indexOfO);
		    }
	}
		
		
		
		
		
		
				 
	}





