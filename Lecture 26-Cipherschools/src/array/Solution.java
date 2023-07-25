package array;




 class Solution {
	static int maximumSumSubarray(int K,ArrayList<Integer>Arr,int N) {
		
		int sum=0;
		
		for(int i=0;i<=K;i++) {
			sum=sum+Arr.get[i];
		}
		int max = sum;
		
			for(int i=0;i<N-K;i++) {
				sum=sum-Arr.get[i]+Arr.get[i+K];
				
			
			if(sum>max)max=sum;
			}
		
		return max;
		
	}

}
