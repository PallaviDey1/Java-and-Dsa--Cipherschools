package dp;

public class LCS {
	
	static int dolCS(String s1, String s2 , int m , int n)
	{
		if(m==0 || n==0)return 0;
		if(s1.charAt(m-1)==s2.charAt(n-1)) {
			return 1 + dolCS(s1,s2,m-1,n-1);
		}
		return Math.max(dolCS(s1,s2,m,n-1),dolCS(s1,s2,m-1, n));
		
	}
	static int dolCSM(String s1, String s2 , int m , int n , int dp[][])
	{
		if(m==0 || n==0)return 0;
		if(dp[m][n]!=0)return dp[m][n];
		if(s1.charAt(m-1)==s2.charAt(n-1)) {
			return 1 + dolCSM(s1,s2,m-1,n-1,dp);
		}
		dp[m][n]=Math.max(dolCSM(s1,s2,m,n-1,dp),dolCSM(s1,s2,m-1, n,dp));
		return dp[m][n];
	}

	
	public static void main(String[] args) {
		String s1="ABCGKH";
		String s2="AEKHR";
		int m=s1.length();
		int n=s2.length();
		System.out.println(dolCS(s1,s2,s1.length(),s2.length()));
		int dp[][]=new int[m+1][n+1];
		System.out.println(dolCSM(s1,s2,m,n,dp));
				
		

	}

}
