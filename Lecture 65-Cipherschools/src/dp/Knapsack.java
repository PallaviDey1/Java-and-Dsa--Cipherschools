package dp;

public class Knapsack {
	static int fillKnapsack(int W,int wt[],int val[],int n)
	{
		if(W==0 || n==0)return 0;
		if(wt[n-1]>W)
		{
			return fillKnapsack(W,wt,val,n-1);
		}
		
		return Math.max(val[n-1]+fillKnapsack(W-wt[n-1],wt,val,n-1),fillKnapsack(W,wt,val,n-1 ));
	}
	
	static int fillKnapsackM(int W,int wt[],int val[],int n,int dp[][])
	{
		if(W==0 || n==0)return 0;
		
		if(dp[n][W]!=0)return dp[n][W];
		if(wt[n-1]>W)
		{
			return fillKnapsackM(W,wt,val,n-1,dp);
		}
		
		return dp[n][W]= Math.max(val[n-1]+fillKnapsackM(W-wt[n-1],wt,val,n-1,dp),fillKnapsackM(W,wt,val,n-1,dp ));
	}

	public static void main(String[] args) {
		int W=50;
		int n=3;
		int val[]= {120,60,100};
		int wt[]= {10,20,30};
		System.out.println(fillKnapsack(W,wt,val,n));
		
		int dp[][]=new int[n+1][W+1];
		System.out.println(fillKnapsackM(W,wt,val,n,dp));
		

	}

}
