package strings;

public class Anagrams2 {
	static boolean isAnagram(String s1, String s2)
	{
		//if length is not same , they can't be anagrams
		if(s1.length()!=s2.length()) return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		int n = s1.length();
		
		int freqArr1[]=new int[26];
		int freqArr2[]=new int[26];
		
		for(int i=0;i<n;i++)
		{
			int index1 = s1.charAt(i) - 'a';
			freqArr1[index1]++;
			
			int index2 = s1.charAt(i) - 'a';
			freqArr2[index2]++;
		}
		for(int i=0;i<26;i++)
		{
			if(freqArr1[i]!=freqArr2[i])
			{
				return false;
			}
		}
		
		
		return true;		
				
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("CAT" , "TAC"));
		System.out.println(isAnagram("CAT" , "TAAG"));
		

	}

}
