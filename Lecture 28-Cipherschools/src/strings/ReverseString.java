package strings;

public class ReverseString {
	public static void main(String[]args) {
		String s1 ="Cipherschools";
		int n=s1.length();
		
		//approach 1
		
		char arr[]=new char[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.charAt(n-1-i);
		}
		//arr has reversed string
		String rev = new String(arr);
		System.out.println(rev);
		
		//time complexity ->O(n)
		//space complexity for arr[n]->O(n)
		
		
		//approach 2
		
		String res = new String();
		for (int i=n-1;i>=0;i--) {
			res = res + s1.charAt(i);
		}
		System.out.println(res);
		
		
		//approach 3
		
		char strArr[]=s1.toCharArray();
		int l=0;
		int r=n-1;
		while(l<r)
		{
			char temp= strArr[l];
			strArr[l]=strArr[r];
			strArr[r]=temp;
			l++;
			r--;
		}
		//swapping done
		String result=new String(strArr);
		System.out.println(result);
	}

}
