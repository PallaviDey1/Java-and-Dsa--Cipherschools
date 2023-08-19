package dp;

public  class EditDistance {
	 static int edit(String s1,String s2,int m,int n);
	
	{
		if(m==0) return n;
		if(n==0)return m;
		if(s1.charAt(m-1)==s2.charAt(n-1))
		{
			return edit(s1,s2,m-1,n-1);
		}
		int replace=1+edit(s1,s2,m-1,n-1);
		int insert=1+edit(s1,s2,m,n-1);
		int delete=1+edit(s1,s2,m-1,n);
		return Math.min(replace, Math.min(insert, delete));
	}

	public static void main(String[] args) {
		String s1="abc";
		String s2="abd";
		int m=s1.length();
		int n=s2.length();
		System.out.println(edit(s1,s2,m,n));
		
		

	}

}
