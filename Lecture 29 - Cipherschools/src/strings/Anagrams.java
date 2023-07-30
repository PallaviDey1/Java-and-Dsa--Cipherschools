package strings;

public class Anagrams {
	static boolean isAnagram(String s1, String s2)
	{
		//if length is not same , they can't be anagrams
		if(s1.length()!=s2.length()) return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		int n = s1.length();
		
		int freqArr1[]=new int[256];
		int freqArr2[]=new int[256];
		
		for(int i=0;i<n;i++)
		{
			int index1 = s1.charAt(i) ;
			freqArr1[index1]++;
			
			int index2 = s1.charAt(i) ;
			freqArr2[index2]++;
		}
		for(int i=0;i<256;i++)
		{
			if(freqArr1[i]!=freqArr2[i])
			{
				return false;
			}
		}
		
		
		return true;		
				
	}

	public static void main(String[] args) {
		System.out.println(isAnagram(" HELLO CAT" , " HELLO TAC"));
		System.out.println(isAnagram("HELLO CAT" , " HELLO TAG"));
		

	}

}
