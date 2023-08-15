package SetsAndMaps;
import java.util.*;

public class SetImpl {
	public static void main(String[]args) {
		Set<Integer> s= new HashSet<>();
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s.contains(2));
		System.out.println(s.contains(3));
		System.out.println(s.size());
		System.out.println(s.contains(4));
		s.remove(3);
		System.out.println(s.contains(3));
		System.out.println(s.size());
		s.add(2);
		System.out.println(s.size());
		for(Integer x:s)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		
		
		s.clear();
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
	}

}
